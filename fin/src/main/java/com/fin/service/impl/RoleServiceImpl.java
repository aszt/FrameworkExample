package com.fin.service.impl;

import com.fin.dao.RoleMapper;
import com.fin.dao.RolePageMapper;
import com.fin.dao.UserRoleMapper;
import com.fin.pojo.*;
import com.fin.service.IRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 角色实现类
 */
@Service("roleService")
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleMapper roleDao;

    @Autowired
    private UserRoleMapper userRoleDao;

    @Autowired
    private RolePageMapper rolePageDao;

    @Override
    public Map<String, Object> addRole(Accounts loginAccounts, Role role) {
        Map<String, Object> map = new HashMap<String, Object>();
        String rolename = role.getRolename();
        RoleExample example = new RoleExample();
        example.createCriteria().andRolenameEqualTo(rolename);
        List<Role> roles = roleDao.selectByExample(example);
        if (roles.size() > 0) {
            map.put("code", "1");
            map.put("msg", "该角色已存在");
        } else {
            // 创建人
            role.setCreatedby(loginAccounts.getAcctseqid());
            // 创建时间
            role.setCreatedat(new Date());
            int count = roleDao.insertSelective(role);
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
    public Map<String, Object> updateRole(Accounts loginAccounts, Role role) {
        Map<String, Object> map = new HashMap<String, Object>();
        Role role1 = roleDao.selectByPrimaryKey(role.getRoleid());
        if (null != role1) {
            String rolename = role.getRolename();
            RoleExample example = new RoleExample();
            example.createCriteria().andRolenameEqualTo(rolename);
            List<Role> roles = roleDao.selectByExample(example);
            if (roles.size() > 0) {
                map.put("code", "1");
                map.put("msg", "该角色已存在");
            } else {
                role1.setRolename(role.getRolename());
                role1.setRoledef(role.getRoledef());
                role1.setDescription(role.getDescription());
                // 修改人
                role1.setUpdatedby(loginAccounts.getAcctseqid());
                // 修改时间
                role1.setUpdatedat(new Date());
                int count = roleDao.updateByPrimaryKey(role1);
                if (count > 0) {
                    map.put("code", "0");
                    map.put("msg", "修改成功");
                } else {
                    map.put("code", "1");
                    map.put("msg", "修改失败");
                }
            }
        } else {
            map.put("code", "1");
            map.put("msg", "角色不存在，请刷新列表");
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteRole(Accounts loginAccounts, int roleid) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 需判断是否建立外键关系
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andRoleidEqualTo(roleid);
        List<UserRole> userRoles = userRoleDao.selectByExample(userRoleExample);
        if (userRoles.size() > 0) {
            map.put("code", "1");
            map.put("msg", "该角色已与用户绑定，请先解绑");
        } else {
            RolePageExample rolePageExample = new RolePageExample();
            rolePageExample.createCriteria().andRoleidEqualTo(roleid);
            List<RolePage> rolePages = rolePageDao.selectByExample(rolePageExample);
            if (rolePages.size() > 0) {
                map.put("code", "1");
                map.put("msg", "该角色已与菜单绑定，请先解绑");
            } else {
                roleDao.deleteByPrimaryKey(roleid);
                map.put("code", "0");
                map.put("msg", "删除成功");
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> findRole(Role role, Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 分页
        PageHelper.startPage(page, limit);
        List<Role> roleList = roleDao.selectByExample(null);
        PageInfo<Role> pages = new PageInfo<Role>(roleList, limit);
        map.put("code", "0");
        map.put("total", pages.getTotal());
        map.put("result", roleList);
        map.put("msg", "查询成功");
        return map;
    }

    @Override
    public Map<String, Object> allRole() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Role> roleList = roleDao.selectByExample(null);
        map.put("code", "0");
        map.put("result", roleList);
        map.put("msg", "查询成功");
        return map;
    }
}
