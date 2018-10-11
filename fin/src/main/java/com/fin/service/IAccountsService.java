package com.fin.service;

import com.fin.pojo.Accounts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 用户接口
 */
public interface IAccountsService {
    /**
     * 用户登录
     *
     * @param accounts
     * @param request
     * @param response
     */
    Map<String, Object> login(Accounts accounts, HttpServletRequest request, HttpServletResponse response);

    /**
     * 新建用户
     *
     * @param loginAccounts
     * @param accounts
     * @return
     */
    Map<String, Object> addAccount(Accounts loginAccounts, Accounts accounts, Integer roleid);

    /**
     * 修改用户
     *
     * @param loginAccounts
     * @param accounts
     * @return
     */
    Map<String, Object> updateAccount(Accounts loginAccounts, Accounts accounts, Integer roleid);

    /**
     * 删除用户
     *
     * @param loginAccounts
     * @param acctseqid
     * @return
     */
    Map<String, Object> deleteAccount(Accounts loginAccounts, Integer acctseqid);

    /**
     * 查找用户
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
    Map<String, Object> findAccount(Integer page, Integer limit, String loginid, String acctname, String companyname, Integer roleid, String acctstatus, String starttime, String endtime);

    /**
     * 退出登录
     *
     * @param token
     */
    void loginout(String token);

    /**
     * 获取登录信息
     *
     * @param account
     * @return
     */
    Map<String, Object> initaccount(Accounts account);

    /**
     * 所有用户列表
     *
     * @return
     */
    Map<String, Object> allAccount();

    /**
     * 重置密码
     *
     * @param loginid
     * @param acctpassword
     * @param newpassword
     * @return
     */
    Map<String, Object> resetPassword(String loginid, String acctpassword, String newpassword);

    /**
     * 修改密码
     *
     * @param loginAccounts
     * @param oldpassword
     * @param newpassword
     * @return
     */
    Map<String, Object> updatePassword(Accounts loginAccounts, String oldpassword, String newpassword);
}
