package com.fin.controller;

import com.fin.bean.UserThreadLocal;
import com.fin.pojo.Accounts;
import com.fin.service.IAccountsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户控制层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    private Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private IAccountsService accountsService;

    /**
     * 用户登录
     *
     * @param accounts
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public Map<String, Object> login(Accounts accounts, HttpServletRequest request, HttpServletResponse response) {
        log.debug("登录调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            String loginid = accounts.getLoginid();
            String acctpassword = accounts.getAcctpassword();
            if (null == loginid || null == acctpassword) {
                map.put("code", "1");
                map.put("msg", "请检查参数");
            } else {
                return accountsService.login(accounts, request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 初始化用户信息
     */
    @ResponseBody
    @RequestMapping(value = "/initaccount", method = {RequestMethod.GET})
    public Map<String, Object> initaccount() {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            log.debug("初始化用户信息");
            Accounts account = UserThreadLocal.get();
            return accountsService.initaccount(account);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 退出登录
     *
     * @param token
     */
    @ResponseBody
    @RequestMapping(value = "/loginout", method = {RequestMethod.POST})
    public void loginout(String token) {
        log.debug("退出调用了");
        accountsService.loginout(token);
    }

    /**
     * 新建用户
     *
     * @param accounts
     * @param roleid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addAccount", method = {RequestMethod.POST})
    public Map<String, Object> addAccount(Accounts accounts, Integer roleid) {
        log.debug("新建用户调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            // 未判断参数是否为空，密码暂未加密
            return accountsService.addAccount(loginAccounts, accounts, roleid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 修改用户
     *
     * @param accounts
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateAccount", method = {RequestMethod.PUT})
    public Map<String, Object> updateAccount(Accounts accounts, Integer roleid) {
        log.debug("修改用户调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return accountsService.updateAccount(loginAccounts, accounts, roleid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 删除用户
     *
     * @param acctseqid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAccount", method = {RequestMethod.DELETE})
    public Map<String, Object> deleteAccount(Integer acctseqid) {
        log.debug("删除用户调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return accountsService.deleteAccount(loginAccounts, acctseqid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 分页用户列表(删除不显示)
     *
     * @param page
     * @param limit
     * @param loginid     登录名
     * @param acctname    姓名
     * @param companyname 商户
     * @param roleid      角色
     * @param acctstatus  状态
     * @param starttime   创建时间
     * @param endtime
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findAccount", method = RequestMethod.GET)
    public Map<String, Object> findAccount(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "limit", defaultValue = "10") Integer limit, String loginid, String acctname, String companyname, @RequestParam(value = "roleid", required = false) Integer roleid, String acctstatus, String starttime, String endtime) {
        log.debug("分页用户列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return accountsService.findAccount(page, limit, loginid, acctname, companyname, roleid, acctstatus, starttime, endtime);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 所有用户列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/allAccount", method = RequestMethod.GET)
    public Map<String, Object> allAccount() {
        log.debug("所有用户列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return accountsService.allAccount();
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 重置密码
     *
     * @param loginid      登录名
     * @param acctpassword 密码
     * @param newpassword  新密码
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
    public Map<String, Object> resetPassword(String loginid, String acctpassword, String newpassword) {
        log.debug("所有用户列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return accountsService.resetPassword(loginid, acctpassword, newpassword);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 修改密码
     *
     * @param oldpassword
     * @param newpassword
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    public Map<String, Object> updatePassword(String oldpassword, String newpassword) {
        log.debug("修改密码调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return accountsService.updatePassword(loginAccounts, oldpassword, newpassword);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

}
