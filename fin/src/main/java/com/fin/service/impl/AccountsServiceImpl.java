package com.fin.service.impl;

import com.alibaba.fastjson.JSON;
import com.fin.common.CookieUtils;
import com.fin.dao.*;
import com.fin.pojo.*;
import com.fin.service.IAccountsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户实现类
 */
@Service("accountsService")
public class AccountsServiceImpl implements IAccountsService {

    // 登录有效时长
    private int LIVETIME = 18000;

    @Autowired
    private AccountsMapper accountsDao;

    @Autowired
    private MerchantMapper merchantDao;

    @Autowired
    private CommonService commonService;

    @Autowired
    private RedisService redisService;

    @Autowired
    private UserRoleMapper userRoleDao;

    @Autowired
    private RoleMapper roleDao;

    @Autowired
    private RolePageMapper rolePageDao;

    @Autowired
    private PagesMapper pagesDao;


    @Override
    public Map<String, Object> login(Accounts accounts, HttpServletRequest request, HttpServletResponse response) {
        String token = null;
        Map<String, Object> map = new HashMap<String, Object>();
        String loginid = accounts.getLoginid();
        String acctpassword = DigestUtils.md5Hex(accounts.getAcctpassword());
        Accounts account = accountsDao.selectByLoginID(loginid);
        if (null != account) {
            if (!acctpassword.equals(account.getAcctpassword())) {
                map.put("code", "1");
                map.put("msg", "密码错误");
                return map;
            } else {
                // 判断是否首次登录
                String acctstatus = account.getAcctstatus();
                if ("N".equals(acctstatus)) {
                    // 新用户
                    map.put("code", "2");
                    map.put("msg", "新用户，请重置密码");
                    return map;
                } else {
                    token = CookieUtils.getCookieValue(request, commonService.COOKIE_NAME);
                    String key = this.commonService.USER_REDIS_KEY + token;
                    String jsonExist = this.redisService.get(key);
                    // 判断是否登录
                    if (null != jsonExist) {
                        map.put("code", "0");
                        map.put("msg", "此用户已登录");
                        map.put(commonService.COOKIE_NAME, token);
                        this.redisService.expire(key, 30 * 60);
                        return map;
                    } else {
                        // 登录成功
                        token = DigestUtils.md5Hex(System.currentTimeMillis() + "" + loginid);
                        String jsonAccount = JSON.toJSONString(account);
                        this.redisService.set(this.commonService.USER_REDIS_KEY + token, jsonAccount, LIVETIME);
                    }
                    map.put("code", "0");
                    map.put("msg", "登录成功");
                    map.put(commonService.COOKIE_NAME, token);
                    return map;
                }
            }
        } else {
            map.put("code", "1");
            map.put("msg", "账户不存在");
            return map;
        }
    }

    @Override
    public Map<String, Object> addAccount(Accounts loginAccounts, Accounts accounts, Integer roleid) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 判断新增用户是否存在
        Accounts account = accountsDao.selectByLoginID(accounts.getLoginid());
        if (null != account) {
            map.put("code", "1");
            map.put("msg", "登录名已存在");
        } else {
            Integer acctseqid = loginAccounts.getAcctseqid();
            // 密码加密
            String acctpassword = accounts.getAcctpassword();
            accounts.setAcctpassword(DigestUtils.md5Hex(acctpassword));
            // 新用户
            accounts.setAcctstatus("N");
            // 账户创建
            accounts.setCreatedflag("N");
            // 密码错误次数
            accounts.setPasserrortime(0);
            // 创建人
            accounts.setCreatedby(acctseqid);
            // 创建时间
            accounts.setCreatedat(new Date());
            // 企业名称
            Integer merid = accounts.getMerid();
            if (merid != null) {
                Merchant merchant = merchantDao.selectByPrimaryKey(merid);
                accounts.setCompanyname(merchant.getCompanyname());
            }
            int count = accountsDao.insert(accounts);

            // 角色处理
            UserRole userRole = new UserRole();
            userRole.setAcctseqid(accounts.getAcctseqid());
            userRole.setRoleid(roleid);
            count += userRoleDao.insert(userRole);

            if (count > 0) {
                map.put("code", "0");
                map.put("msg", "添加成功");
            } else {
                map.put("code", "1");
                map.put("msg", "添加失败");
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> updateAccount(Accounts loginAccounts, Accounts accounts, Integer roleid) {
        Map<String, Object> map = new HashMap<String, Object>();
        Integer acctseqid = loginAccounts.getAcctseqid();
        Integer merid = accounts.getMerid();
        Accounts accounts1 = accountsDao.selectByPrimaryKey(accounts.getAcctseqid());
        accounts1.setAcctmobileno(accounts.getAcctmobileno());
        accounts1.setAcctemail(accounts.getAcctemail());
        accounts1.setAcctname(accounts.getAcctname());
        accounts1.setGender(accounts.getGender());
        accounts1.setMerid(accounts.getMerid());
        // 修改人
        accounts1.setUpdatedby(acctseqid);
        // 公司
        if (merid != null) {
            Merchant merchant = merchantDao.selectByPrimaryKey(merid);
            accounts1.setCompanyname(merchant.getCompanyname());
        } else {
            accounts1.setCompanyname("");
        }
        int count = accountsDao.updateByPrimaryKey(accounts1);

        // 角色处理
        UserRole userRole = userRoleDao.selectByAcctSeqID(accounts.getAcctseqid());
        if (null == userRole) {
            UserRole userRoles = new UserRole();
            userRoles.setAcctseqid(accounts.getAcctseqid());
            userRoles.setRoleid(roleid);
            count += userRoleDao.insert(userRoles);
        } else {
            userRole.setRoleid(roleid);
            UserRoleExample example = new UserRoleExample();
            example.createCriteria().andAcctseqidEqualTo(accounts.getAcctseqid());
            count += userRoleDao.updateByExample(userRole, example);
        }

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
    public Map<String, Object> deleteAccount(Accounts loginAccounts, Integer acctseqid) {
        Map<String, Object> map = new HashMap<String, Object>();
        Accounts accounts = accountsDao.selectByPrimaryKey(acctseqid);
        Integer acctseqids = loginAccounts.getAcctseqid();
        if (acctseqids == acctseqid) {
            map.put("code", "1");
            map.put("msg", "目前登录账户不可删除");
        } else {
            // 修改状态
            accounts.setAcctstatus("D");
            // 修改人
            accounts.setUpdatedby(acctseqids);
            // 修改时间
            accounts.setUpdatedat(new Date());
            int count = accountsDao.updateByPrimaryKey(accounts);
            if (count > 0) {
                map.put("code", "0");
                map.put("msg", "删除成功");
            } else {
                map.put("code", "1");
                map.put("msg", "删除失败");
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> findAccount(Integer page, Integer limit, String loginid, String acctname, String companyname, Integer roleid, String acctstatus, String starttime, String endtime) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 分页
        PageHelper.startPage(page, limit);
        /*AccountsExample example = new AccountsExample();
        example.createCriteria().andAcctstatusNotEqualTo("D");
        example.setOrderByClause("CreatedAt desc");
        List<Accounts> accountsList = accountsDao.selectByExample(example);
        for (Accounts account : accountsList) {
            UserRole userRole = userRoleDao.selectByAcctSeqID(account.getAcctseqid());
            if (null != userRole) {
                Role role = roleDao.selectByPrimaryKey(userRole.getRoleid());
                account.setRole(role);
            }
        }*/
        List<Accounts> accountsList = accountsDao.selectAll(loginid, acctname, companyname, roleid, acctstatus, starttime, endtime);
        PageInfo<Accounts> pages = new PageInfo<Accounts>(accountsList, limit);
        map.put("code", "0");
        map.put("total", pages.getTotal());
        map.put("result", accountsList);
        map.put("msg", "查询成功");
        return map;
    }

    @Override
    public void loginout(String token) {
        String user_REDIS_KEY = commonService.USER_REDIS_KEY;
        redisService.del(user_REDIS_KEY + token);
    }

    @Override
    public Map<String, Object> initaccount(Accounts account) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 一、获取用户角色id
        UserRole userRole = userRoleDao.selectByAcctSeqID(account.getAcctseqid());
        if (null != userRole) {
            // 二、通过角色id获取pageid
            RolePageExample rolePageExample = new RolePageExample();
            rolePageExample.createCriteria().andRoleidEqualTo(userRole.getRoleid());
            List<RolePage> rolePages = rolePageDao.selectByExample(rolePageExample);
            String array[];
            if (rolePages.size() > 0) {
                array = new String[rolePages.size()];
                for (int i = 0; i < rolePages.size(); i++) {
                    // 三、通过pageid获取菜单英文名加入数组
                    Pages pages = pagesDao.selectByPrimaryKey(rolePages.get(i).getPageid());
                    array[i] = pages.getTargetframe();
                }
                map.put("roles", array);
            } else {
                map.put("roles", null);
                map.put("msg", "该角色未分配权限");
            }
        } else {
            map.put("roles", null);
            map.put("msg", "该用户无角色");
        }
        map.put("name", account.getAcctname());
        map.put("company", account.getCompanyname());
        map.put("code", "0");
        return map;
    }

    @Override
    public Map<String, Object> allAccount() {
        Map<String, Object> map = new HashMap<String, Object>();
        AccountsExample example = new AccountsExample();
        example.createCriteria().andAcctstatusNotEqualTo("D");
        List<Accounts> accountsList = accountsDao.selectByExample(example);
        map.put("code", "0");
        map.put("result", accountsList);
        map.put("msg", "查询成功");
        return null;
    }

    @Override
    public Map<String, Object> resetPassword(String loginid, String acctpassword, String newpassword) {
        Map<String, Object> map = new HashMap<String, Object>();
        Accounts accounts = accountsDao.selectByLoginID(loginid);
        if (accounts.getAcctpassword().equals(DigestUtils.md5Hex(acctpassword))) {
            accounts.setAcctpassword(DigestUtils.md5Hex(newpassword));
            accounts.setAcctstatus("G");
            accountsDao.updateByPrimaryKey(accounts);
            map.put("code", "0");
            map.put("msg", "重置成功,请重新登录");
        } else {
            map.put("code", "1");
            map.put("msg", "密码错误");
        }
        return map;
    }

    @Override
    public Map<String, Object> updatePassword(Accounts loginAccounts, String oldpassword, String newpassword) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (null == oldpassword || ("").equals(oldpassword) || null == newpassword || ("").equals(newpassword)) {
            map.put("code", "1");
            map.put("msg", "参数不能为空");
        } else {
            String acctpassword = loginAccounts.getAcctpassword();
            if (acctpassword.equals(DigestUtils.md5Hex(newpassword))) {
                map.put("code", "1");
                map.put("msg", "新密码不可与原密码相同");
            } else {
                loginAccounts.setAcctpassword(DigestUtils.md5Hex(newpassword));
                accountsDao.updateByPrimaryKey(loginAccounts);
                map.put("code", "0");
                map.put("msg", "修改成功，请重新登录");
            }
        }
        return map;
    }
}
