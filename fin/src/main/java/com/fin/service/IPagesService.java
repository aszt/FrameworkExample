package com.fin.service;

import com.fin.pojo.Accounts;
import com.fin.pojo.Pages;

import java.util.Map;

/**
 * 菜单表接口
 */
public interface IPagesService {
    /**
     * 新建菜单
     *
     * @param loginAccounts
     * @param pages
     * @return
     */
    Map<String, Object> addPages(Accounts loginAccounts, Pages pages);

    /**
     * 修改菜单
     *
     * @param loginAccounts
     * @param pages
     * @return
     */
    Map<String, Object> updatePages(Accounts loginAccounts, Pages pages);

    /**
     * 删除菜单
     *
     * @param loginAccounts
     * @param pageid
     * @return
     */
    Map<String, Object> deletePages(Accounts loginAccounts, Integer pageid);

    /**
     * 菜单列表
     *
     * @return
     */
    Map<String, Object> findPages();

    /**
     * 判断是否有子级菜单
     *
     * @param pageid
     * @return
     */
    int isSubsetPages(Integer pageid);

    /**
     * 下拉菜单列表
     *
     * @param pageid
     * @return
     */
    Map<String, Object> allPages(Integer pageid);

    /**
     * 查询菜单
     *
     * @param pageid
     * @return
     */
    Map<String, Object> selectPages(Integer pageid);
}
