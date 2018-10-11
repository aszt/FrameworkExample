package com.fin.service.impl;

import com.fin.common.FormBuilder;
import com.fin.dao.MerchantMapper;
import com.fin.pojo.Accounts;
import com.fin.pojo.Merchant;
import com.fin.pojo.MerchantExample;
import com.fin.service.IMerchantService;
import com.fin.service.ISequenceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商户实现类
 */
@Service("merchantService")
public class MerchantServiceImpl implements IMerchantService {

    @Autowired
    private MerchantMapper merchantDao;

    @Autowired
    private ISequenceService sequenceService;

    @Autowired
    private QiniuCloudService qiniuCloudService;

    @Autowired
    private CommonService commonService;

    @Override
    public Map<String, Object> addMerchant(Accounts account, Merchant merchant, MultipartFile file) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        // 获取商户顺位号
        String sequenceId = FormBuilder.getMerchantNo("SH", sequenceService.getSequence());
        merchant.setMerchantno(sequenceId);
        String uploadUrl = qiniuCloudService.upload(file, commonService.QINIU_CLOUD_DOMAIN);
        // 营业执照或名片
        merchant.setImgurl(uploadUrl);
        // 创建时间
        merchant.setCreatedate(new Date());
        // 保证金缴纳标识
        merchant.setIsdeposit("N");
        // 公司状态
        merchant.setOrgstatus("N");
        // 创建人
        merchant.setCreatedby(account.getAcctseqid());
        // 层级判断
        Integer parentid = merchant.getParentid();
        if (0 == parentid) {
            merchant.setLevelin(1);
        } else {
            Merchant merchant1 = merchantDao.selectByPrimaryKey(parentid);
            merchant.setLevelin(merchant1.getLevelin() + 1);
        }
        int count = merchantDao.insertSelective(merchant);
        if (count > 0) {
            map.put("code", "0");
            map.put("msg", "新增成功");
        } else {
            map.put("code", "1");
            map.put("msg", "新增失败");
        }
        return map;
    }

    @Override
    public Map<String, Object> updateMerchant(Accounts account, Merchant merchant, MultipartFile file) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        Integer merid = merchant.getMerid();
        Merchant merchant1 = merchantDao.selectByPrimaryKey(merid);
        if (null != file && file.getSize() != 0) {
            String uploadUrl = qiniuCloudService.upload(file, commonService.QINIU_CLOUD_DOMAIN);
            // 营业执照或名片
            merchant1.setImgurl(uploadUrl);
        }
        String companyname = merchant.getCompanyname();
        merchant1.setCompanyname(companyname);
        String nameabbr = merchant.getNameabbr();
        merchant1.setNameabbr(nameabbr);
        String meremail = merchant.getMeremail();
        merchant1.setMeremail(meremail);
        String name = merchant.getName();
        merchant1.setName(name);
        String mobileno = merchant.getMobileno();
        merchant1.setMobileno(mobileno);
        // 父公司修改
        Integer parentid = merchant.getParentid();
        merchant1.setParentid(parentid);
        // 层级修改
        if (0 == parentid) {
            merchant1.setLevelin(1);
        } else {
            Merchant merchant2 = merchantDao.selectByPrimaryKey(parentid);
            merchant1.setLevelin(merchant2.getLevelin() + 1);
        }
        // 工作流键修改
        String workflowkey = merchant.getWorkflowkey();
        merchant1.setWorkflowkey(workflowkey);
        // 公司类型
        String orgtype = merchant.getOrgtype();
        merchant1.setOrgtype(orgtype);
        // 修改时间
        merchant1.setUpdatedat(new Date());
        // 修改人
        merchant1.setUpdatedby(account.getAcctseqid());
        int count = merchantDao.updateByPrimaryKey(merchant1);
        if (count > 0) {
            map.put("code", "0");
            map.put("msg", "修改成功");
        } else {
            map.put("code", "1");
            map.put("msg", "修改失败");
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteMerchant(int merid) {
        Map<String, Object> map = new HashMap<String, Object>();
        Merchant merchant = merchantDao.selectByPrimaryKey(merid);
        if (null != merchant) {
            MerchantExample example = new MerchantExample();
            example.createCriteria().andParentidEqualTo(merid);
            List<Merchant> merchantList = merchantDao.selectByExample(example);
            if (merchantList.size() > 0) {
                map.put("code", "1");
                map.put("msg", "该商户下存在子商户，不可删除");
            } else {
                merchant.setOrgstatus("D");
                merchantDao.updateByPrimaryKey(merchant);
                map.put("code", "0");
                map.put("msg", "删除成功");
            }
        } else {
            map.put("code", "1");
            map.put("msg", "该商户不存在");
        }
        return map;
    }

    @Override
    public Map<String, Object> findMerchant(Integer page, Integer limit, String merchantno, String companyname, String name, String parentcompany, String orgtype, String orgstatus, String starttime, String endtime) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 分页
        PageHelper.startPage(page, limit);
        /*MerchantExample example = new MerchantExample();
        example.createCriteria().andOrgstatusNotEqualTo("D");
        List<Merchant> merchantList = merchantDao.selectByExample(example);*/
        List<Merchant> merchantList = merchantDao.selectAll(merchantno, companyname, name, parentcompany, orgtype, orgstatus, starttime, endtime);
        PageInfo<Merchant> pages = new PageInfo<Merchant>(merchantList, limit);
        map.put("code", "0");
        map.put("total", pages.getTotal());
        map.put("result", merchantList);
        map.put("msg", "查询成功");
        return map;
    }

    @Override
    public Map<String, Object> activationMerchant(int merid) {
        Map<String, Object> map = new HashMap<String, Object>();
        Merchant merchant = merchantDao.selectByPrimaryKey(merid);
        if (null != merchant) {
            merchant.setOrgstatus("A");
            merchantDao.updateByPrimaryKey(merchant);
            map.put("code", "0");
            map.put("msg", "激活成功");
        } else {
            map.put("code", "1");
            map.put("msg", "该商户不存在");
        }
        return map;
    }

    @Override
    public Map<String, Object> allMerchant(Integer merid) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (null != merid) {
            MerchantExample example = new MerchantExample();
            example.createCriteria().andOrgstatusNotEqualTo("D").andMeridNotEqualTo(merid);
            List<Merchant> merchantList = merchantDao.selectByExample(example);
            map.put("result", merchantList);
        } else {
            MerchantExample example = new MerchantExample();
            example.createCriteria().andOrgstatusNotEqualTo("D");
            List<Merchant> merchantList = merchantDao.selectByExample(example);
            map.put("result", merchantList);
        }
        map.put("code", "0");
        map.put("msg", "查询成功");
        return map;
    }
}
