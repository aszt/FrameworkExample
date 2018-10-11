package com.fin.controller;

import com.fin.bean.UserThreadLocal;
import com.fin.pojo.Accounts;
import com.fin.pojo.Merchant;
import com.fin.service.IMerchantService;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 商户、账户控制层
 */
@Controller
@RequestMapping("/merchant")
public class MerchantController {

    private Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private IMerchantService merchantService;

    /**
     * 新增商户
     *
     * @param merchant
     * @param request
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "/addMerchant", method = {RequestMethod.POST})
    public Map<String, Object> addMerchant(Merchant merchant, HttpServletRequest request) {
        log.debug("新增商户调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts account = UserThreadLocal.get();
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if (isMultipart) {
                MultipartHttpServletRequest multipartRequest = WebUtils.getNativeRequest(request,
                        MultipartHttpServletRequest.class);
                MultipartFile file = multipartRequest.getFile("file");
                if (null != file) {
                    return merchantService.addMerchant(account, merchant, file);
                } else {
                    map.put("code", "1");
                    map.put("msg", "图片不能为空");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 修改商户
     *
     * @param merchant
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateMerchant", method = {RequestMethod.POST})
    public Map<String, Object> updateMerchant(Merchant merchant, HttpServletRequest request) {
        log.debug("修改商户调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts account = UserThreadLocal.get();
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if (isMultipart) {
                MultipartHttpServletRequest multipartRequest = WebUtils.getNativeRequest(request,
                        MultipartHttpServletRequest.class);
                MultipartFile file = multipartRequest.getFile("file");
                if (null != file) {
                    return merchantService.updateMerchant(account, merchant, file);
                } else {
                    return merchantService.updateMerchant(account, merchant, null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 删除商户
     *
     * @param merid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteMerchant", method = {RequestMethod.DELETE})
    public Map<String, Object> deleteMerchant(int merid) {
        log.debug("删除商户调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts account = UserThreadLocal.get();
            return merchantService.deleteMerchant(merid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 商户列表(删除不显示)
     *
     * @param page
     * @param limit
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
    @ResponseBody
    @RequestMapping(value = "/findMerchant", method = {RequestMethod.GET})
    public Map<String, Object> findMerchant(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "limit", defaultValue = "10") Integer limit, String merchantno, String companyname, String name, String parentcompany, String orgtype, String orgstatus, String starttime, String endtime) {
        log.debug("商户列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts account = UserThreadLocal.get();
            return merchantService.findMerchant(page, limit, merchantno, companyname, name, parentcompany, orgtype, orgstatus, starttime, endtime);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 商户下拉列表
     *
     * @param merid 传-去除自己，不传-所有
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/allMerchant", method = {RequestMethod.GET})
    public Map<String, Object> allMerchant(@RequestParam(value = "merid", required = false) Integer merid) {
        log.debug("商户下拉列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return merchantService.allMerchant(merid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 激活商户
     *
     * @param merid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/activationMerchant", method = {RequestMethod.PUT})
    public Map<String, Object> activationMerchant(int merid) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return merchantService.activationMerchant(merid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

}
