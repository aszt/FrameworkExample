package com.fin.service;

import com.fin.pojo.Accounts;
import com.fin.pojo.Role;

import java.util.Map;

/**
 * 角色接口类
 */
public interface IRoleService {
    /**
     * 新增角色
     *
     * @param loginAccounts
     * @param role
     * @return
     */
    Map<String, Object> addRole(Accounts loginAccounts, Role role);

    /**
     * 修改角色
     *
     * @param loginAccounts
     * @param role
     * @return
     */
    Map<String, Object> updateRole(Accounts loginAccounts, Role role);

    /**
     * 删除角色
     *
     * @param loginAccounts
     * @param roleid
     * @return
     */
    Map<String, Object> deleteRole(Accounts loginAccounts, int roleid);

    /**
     * 角色列表
     *
     * @param role
     * @param page
     * @param limit
     * @return
     */
    Map<String, Object> findRole(Role role, Integer page, Integer limit);

    /**
     * 下拉角色列表
     *
     * @return
     */
    Map<String, Object> allRole();
}
