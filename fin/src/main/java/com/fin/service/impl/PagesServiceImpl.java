package com.fin.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.fin.dao.PagesMapper;
import com.fin.dao.RolePageMapper;
import com.fin.pojo.*;
import com.fin.service.IPagesService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 菜单表实现类
 */
@Service("pagesService")
public class PagesServiceImpl implements IPagesService {
    @Autowired
    private PagesMapper pagesDao;

    @Autowired
    private RolePageMapper rolePageDao;

    @Override
    public Map<String, Object> addPages(Accounts loginAccounts, Pages pages) {
        Map<String, Object> map = new HashMap<String, Object>();
        String isleaf = pages.getIsleaf();
        if (isleaf.equals("Y")) {
            if (0 == pages.getParentid()) {
                map.put("code", "1");
                map.put("msg", "请选择上级菜单");
            } else {
                pagesDao.insertSelective(pages);
                map.put("code", "0");
                map.put("msg", "添加成功");
            }
        } else {
            pagesDao.insertSelective(pages);
            map.put("code", "0");
            map.put("msg", "添加成功");
        }
        return map;
    }

    @Override
    public Map<String, Object> updatePages(Accounts loginAccounts, Pages pages) {
        Map<String, Object> map = new HashMap<String, Object>();
        Integer pageid = pages.getPageid();
        Pages pages1 = pagesDao.selectByPrimaryKey(pageid);
        if (null != pages1) {
            pages1.setPagekey(pages.getPagekey());
            pages1.setPagetext(pages.getPagetext());
            pages1.setPageurl(pages.getPageurl());
            pages1.setIsleaf(pages.getIsleaf());
            pages1.setPageid(pages.getPageid());
            pages1.setParentid(pages.getParentid());
            pages1.setTargetframe(pages.getTargetframe());
            pagesDao.updateByPrimaryKey(pages1);

            // 子菜单名称修改
            int parentid = pages.getParentid();
            String title = null;
            if (parentid == 0) {
                title = pages.getPagekey();
            } else {
                title = pages.getPagetext();
            }
            PagesExample pagesExample = new PagesExample();
            pagesExample.createCriteria().andParentidEqualTo(pages.getPageid());
            List<Pages> pagesList = pagesDao.selectByExample(pagesExample);
            if (pagesList.size() > 0) {
                for (Pages page : pagesList) {
                    page.setPagekey(title);
                    pagesDao.updateByPrimaryKey(page);
                }
            }

            map.put("code", "0");
            map.put("msg", "修改成功");
        } else {
            map.put("code", "1");
            map.put("msg", "菜单不存在");
        }
        return map;
    }

    @Override
    public Map<String, Object> deletePages(Accounts loginAccounts, Integer pageid) {
        Map<String, Object> map = new HashMap<String, Object>();
        Pages pages = pagesDao.selectByPrimaryKey(pageid);
        if (null != pages) {
            RolePageExample example = new RolePageExample();
            example.createCriteria().andPageidEqualTo(pageid);
            List<RolePage> rolePages = rolePageDao.selectByExample(example);
            if (rolePages.size() > 0) {
                map.put("code", "1");
                map.put("msg", "该菜单已与角色绑定，请先解绑");
            } else {
                traversalDelete(pages);
                pagesDao.deleteByPrimaryKey(pageid);
                map.put("code", "0");
                map.put("msg", "删除成功");
            }
        } else {
            map.put("code", "1");
            map.put("msg", "该菜单不存在");
        }
        return map;
    }

    /**
     * 迭代删除
     *
     * @return
     */
    public void traversalDelete(Pages pages) {
        Integer pageid = pages.getPageid();
        PagesExample pagesExample1 = new PagesExample();
        pagesExample1.createCriteria().andParentidEqualTo(pageid);
        List<Pages> pagesList = pagesDao.selectByExample(pagesExample1);
        if (pagesList.size() > 0) {
            // 先删除子级
            for (Pages page : pagesList) {
                traversalDelete(page);
                PagesExample pagesExamples = new PagesExample();
                pagesExamples.createCriteria().andParentidEqualTo(pageid);
                pagesDao.deleteByExample(pagesExamples);
            }
        }
    }

    @Override
    public Map<String, Object> findPages() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<JSONObject> pageList = new ArrayList<JSONObject>();
        PagesExample example = new PagesExample();
        example.createCriteria().andParentidEqualTo(0);
        List<Pages> pages = pagesDao.selectByExample(example);
        if (pages.size() > 0) {
            for (Pages page : pages) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", page.getPageid());
                jsonObject.put("label", page.getPagekey());
                jsonObject = traversalMenu(jsonObject, page.getPageid());
                pageList.add(jsonObject);
            }
            map.put("code", "0");
            map.put("msg", "菜单列表");
            map.put("result", pageList);
        } else {
            map.put("code", "0");
            map.put("msg", "无数据");
        }
        return map;
    }

    @Override
    public int isSubsetPages(Integer pageid) {
        PagesExample example = new PagesExample();
        example.createCriteria().andParentidEqualTo(pageid);
        List<Pages> pages = pagesDao.selectByExample(example);
        if (pages.size() > 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public Map<String, Object> allPages(Integer pageid) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (null != pageid) {
            Pages pages = pagesDao.selectByPrimaryKey(pageid);
            PagesExample pagesExample = new PagesExample();
            PagesExample.Criteria criteria = pagesExample.createCriteria();
            criteria.andPageidNotEqualTo(pages.getPageid());
            traversalMenus(criteria, pages);
            List<Pages> pagesList = pagesDao.selectByExample(pagesExample);
            map.put("code", "0");
            map.put("msg", "查询成功");
            map.put("result", pagesList);
        } else {
            List<Pages> pagesList = pagesDao.selectByExample(null);
            map.put("code", "0");
            map.put("msg", "查询成功");
            map.put("result", pagesList);
        }
        return map;
    }

    @Override
    public Map<String, Object> selectPages(Integer pageid) {
        Map<String, Object> map = new HashMap<String, Object>();
        Pages pages = pagesDao.selectByPrimaryKey(pageid);
        map.put("code", "0");
        map.put("msg", "查询成功");
        map.put("result", pages);
        return map;
    }

    public void traversalMenus(PagesExample.Criteria criteria, Pages pages) {
        PagesExample pagesExample = new PagesExample();
        pagesExample.createCriteria().andParentidEqualTo(pages.getPageid());
        List<Pages> pagesList = pagesDao.selectByExample(pagesExample);
        if (pagesList.size() > 0) {
            for (Pages Pages : pagesList) {
                criteria.andPageidNotEqualTo(Pages.getPageid());
                traversalMenus(criteria, Pages);
            }
        }
    }

    /**
     * 遍历菜单
     *
     * @param jsonObject
     * @param pageid
     * @return
     */
    public JSONObject traversalMenu(JSONObject jsonObject, int pageid) {
        PagesExample example = new PagesExample();
        example.createCriteria().andParentidEqualTo(pageid);
        List<Pages> pages = pagesDao.selectByExample(example);
        List<JSONObject> pageList = new ArrayList<JSONObject>();
        if (pages.size() > 0) {
            JSONObject jsonObject1 = null;
            for (Pages page2 : pages) {
                jsonObject1 = new JSONObject();
                jsonObject1.put("id", page2.getPageid());
                jsonObject1.put("label", page2.getPagetext());
                jsonObject1 = traversalMenu(jsonObject1, page2.getPageid());
                pageList.add(jsonObject1);
            }
            jsonObject.put("children", pageList);
        }
        return jsonObject;
    }
}
