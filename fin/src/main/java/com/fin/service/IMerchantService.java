package com.fin.service;

import com.fin.pojo.Accounts;
import com.fin.pojo.Merchant;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

/**
 * 商户接口
 */
public interface IMerchantService {

    /**
     * 新增商户
     *
     * @param account  登录用户
     * @param merchant 商户信息
     * @param file     执照文件
     * @return
     */
    Map<String, Object> addMerchant(Accounts account, Merchant merchant, MultipartFile file) throws IOException;

    /**
     * 修改商户
     *
     * @param account
     * @param merchant
     * @param file
     * @return
     */
    Map<String, Object> updateMerchant(Accounts account, Merchant merchant, MultipartFile file) throws IOException;

    /**
     * 删除商户
     *
     * @param merid
     * @return
     */
    Map<String, Object> deleteMerchant(int merid);

    /**
     * 商户列表
     *
     * @param merchantno    代理商编号
     * @param companyname   公司名称
     * @param name          联系人
     * @param parentcompany 父公司
     * @param orgtype       公司类型
     * @param orgstatus     状态
     * @param starttime     创建时间
     * @param endtime
     * @return
     */
    Map<String, Object> findMerchant(Integer page, Integer limit, String merchantno, String companyname, String name, String parentcompany, String orgtype, String orgstatus, String starttime, String endtime);

    /**
     * 激活商户
     *
     * @param merid
     * @return
     */
    Map<String, Object> activationMerchant(int merid);

    /**
     * 商户下拉列表
     *
     * @param merid
     * @return
     */
    Map<String, Object> allMerchant(Integer merid);
}
