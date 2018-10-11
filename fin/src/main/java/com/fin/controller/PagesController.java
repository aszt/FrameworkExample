package com.fin.controller;

import com.fin.bean.UserThreadLocal;
import com.fin.pojo.Accounts;
import com.fin.pojo.Pages;
import com.fin.service.IPagesService;
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
 * 菜单控制层
 */
@Controller
@RequestMapping("/pages")
public class PagesController {

    private Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private IPagesService pagesService;

    /**
     * 新建菜单
     *
     * @param pages
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addPages", method = {RequestMethod.POST})
    public Map<String, Object> addPages(Pages pages) {
        log.debug("新建菜单调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return pagesService.addPages(loginAccounts, pages);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 修改菜单
     *
     * @param pages
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updatePages", method = {RequestMethod.PUT})
    public Map<String, Object> updatePages(Pages pages) {
        log.debug("修改菜单调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return pagesService.updatePages(loginAccounts, pages);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 判断是否有子级菜单
     *
     * @param pageid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/isSubsetPages", method = {RequestMethod.GET})
    public int isSubsetPages(Integer pageid) {
        log.debug("判断是否有子级菜单调用了");
        try {
            return pagesService.isSubsetPages(pageid);
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }


    /**
     * 删除菜单
     *
     * @param pageid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deletePages", method = {RequestMethod.DELETE})
    public Map<String, Object> deletePages(Integer pageid) {
        log.debug("删除菜单调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Accounts loginAccounts = UserThreadLocal.get();
            return pagesService.deletePages(loginAccounts, pageid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 查询菜单
     *
     * @param pageid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectPages", method = {RequestMethod.GET})
    public Map<String, Object> selectPages(Integer pageid) {
        log.debug("查询菜单列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return pagesService.selectPages(pageid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 菜单列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findPages", method = {RequestMethod.GET})
    public Map<String, Object> findPages() {
        log.debug("菜单列表调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return pagesService.findPages();
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 下拉菜单列表
     *
     * @param pageid 无值-所有、有值-除自己及子菜单
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/allPages", method = {RequestMethod.GET})
    public Map<String, Object> allPages(@RequestParam(value = "pageid", required = false) Integer pageid) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return pagesService.allPages(pageid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

}
