package com.fin.controller;

import com.fin.pojo.Dictionary;
import com.fin.service.IDictionaryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 字典定义或下拉列表值
 */
@Controller
@RequestMapping("/dictionary")
public class DictionaryController {

    private Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private IDictionaryService dictionaryService;

    /**
     * 获取性别
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getSex", method = {RequestMethod.GET})
    public List<Dictionary> getSex() {
        List<Dictionary> dictionaryList = new ArrayList<Dictionary>();
        try {
            dictionaryList = dictionaryService.getDictionaryList("2001");
            log.debug("获取性别调用了");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dictionaryList;
    }

    /**
     * 获取商户类型
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getMerchantType", method = {RequestMethod.GET})
    public List<Dictionary> getMerchantType() {
        List<Dictionary> dictionaryList = new ArrayList<Dictionary>();
        try {
            dictionaryList = dictionaryService.getDictionaryList("2204");
            log.debug("获取商户类型调用了");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dictionaryList;
    }

    /**
     * 菜单类型
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getMenuType", method = {RequestMethod.GET})
    public List<Dictionary> getMenuType() {
        List<Dictionary> dictionaryList = new ArrayList<Dictionary>();
        try {
            dictionaryList = dictionaryService.getDictionaryList("2003");
            log.debug("获取菜单类型调用了");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dictionaryList;
    }

    /**
     * 商户状态
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getMerchantStatus", method = {RequestMethod.GET})
    public List<Dictionary> getMerchantStatus() {
        List<Dictionary> dictionaryList = new ArrayList<Dictionary>();
        try {
            dictionaryList = dictionaryService.getDictionaryList("2203");
            log.debug("获取商户状态调用了");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dictionaryList;
    }

    /**
     * 账户类型
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAccountsType", method = {RequestMethod.GET})
    public List<Dictionary> getAccountsType() {
        List<Dictionary> dictionaryList = new ArrayList<Dictionary>();
        try {
            dictionaryList = dictionaryService.getDictionaryList("2002");
            log.debug("获取账户类型调用了");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dictionaryList;
    }
}
