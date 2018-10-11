package com.fin.controller;

import com.fin.bean.UserThreadLocal;
import com.fin.pojo.Accounts;
import com.fin.pojo.Role;
import com.fin.service.IRoleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 角色控制层
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    private Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private IRoleService roleService;

    /**
     * 新建角色
     *
     * @param role
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addRole", method = {RequestMethod.POST})
    public Map<String, Object> addRole(Role role) {
        log.debug("新建角色调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return roleService.addRole(loginAccounts, role);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 修改角色
     *
     * @param role
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateRole", method = {RequestMethod.PUT})
    public Map<String, Object> updateRole(Role role) {
        log.debug("修改角色调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return roleService.updateRole(loginAccounts, role);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 删除角色
     *
     * @param roleid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteRole", method = {RequestMethod.DELETE})
    public Map<String, Object> deleteRole(int roleid) {
        log.debug("删除角色调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return roleService.deleteRole(loginAccounts, roleid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 角色列表
     *
     * @param role
     * @param page
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findRole", method = {RequestMethod.GET})
    public Map<String, Object> findRole(Role role, @RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "limit", defaultValue = "10") Integer limit) {
        log.debug("角色列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return roleService.findRole(role, page, limit);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 下拉角色列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/allRole", method = {RequestMethod.GET})
    public Map<String, Object> allRole() {
        log.debug("下拉角色列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return roleService.allRole();
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

}
