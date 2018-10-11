package com.fin.controller;

import com.fin.service.IPowerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 权限控制层
 */
@Controller
@RequestMapping("/power")
public class PowerController {
    private Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private IPowerService powerService;

    /**
     * 权限分配
     *
     * @param roleid   角色
     * @param pages    菜单项
     * @param roleecho 角色权限
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/distributionPower", method = {RequestMethod.POST})
    public Map<String, Object> distributionPower(Integer roleid, Integer[] pages, Integer[] roleecho) {
        log.debug("权限分配调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return powerService.distributionPower(roleid, pages, roleecho);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }

    /**
     * 查看权限
     *
     * @param roleid 角色
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectPower", method = {RequestMethod.GET})
    public Map<String, Object> selectPower(Integer roleid) {
        log.debug("查看权限调用了");
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            return powerService.selectPower(roleid);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "异常");
        }
        return map;
    }
}
