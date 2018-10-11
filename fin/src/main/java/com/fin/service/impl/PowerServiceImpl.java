package com.fin.service.impl;

import com.fin.dao.RoleMapper;
import com.fin.dao.RolePageMapper;
import com.fin.pojo.Role;
import com.fin.pojo.RolePage;
import com.fin.pojo.RolePageExample;
import com.fin.service.IPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 权限实现类
 */
@Service("powerService")
public class PowerServiceImpl implements IPowerService {

    @Autowired
    private RolePageMapper rolePagedao;

    @Autowired
    private RoleMapper roleDao;

    @Override
    public Map<String, Object> distributionPower(Integer roleid, Integer[] pages, Integer[] roleecho) {
        Map<String, Object> map = new HashMap<String, Object>();
        Role role = roleDao.selectByPrimaryKey(roleid);
        if (null != role) {
            RolePageExample rolePageExample = new RolePageExample();
            rolePageExample.createCriteria().andRoleidEqualTo(roleid);
            // 先删除
            rolePagedao.deleteByExample(rolePageExample);
            // 增加
            for (int pageid : pages) {
                RolePage rolePage = new RolePage();
                rolePage.setPageid(pageid);
                rolePage.setRoleid(roleid);
                rolePagedao.insert(rolePage);
            }
            role.setRoleecho(Arrays.toString(roleecho));
            roleDao.updateByPrimaryKey(role);
            map.put("code", "0");
            map.put("msg", "分配成功");
        } else {
            map.put("code", "1");
            map.put("msg", "角色不存在，请刷新列表");
        }
        return map;
    }

    @Override
    public Map<String, Object> selectPower(Integer roleid) {
        Map<String, Object> map = new HashMap<String, Object>();
       /* RolePageExample rolePageExample = new RolePageExample();
        rolePageExample.createCriteria().andRoleidEqualTo(roleid);
        List<RolePage> rolePages = rolePagedao.selectByExample(rolePageExample);*/
        Role role = roleDao.selectByPrimaryKey(roleid);
        map.put("code", "0");
        map.put("result", role);
        map.put("msg", "查询成功");
        return map;
    }
}
