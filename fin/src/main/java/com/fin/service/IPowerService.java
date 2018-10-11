package com.fin.service;

import java.util.Map;

/**
 * 权限接口
 */
public interface IPowerService {
    /**
     * 权限分配
     *
     * @param roleid
     * @param pages
     * @param roleecho
     * @return
     */
    Map<String, Object> distributionPower(Integer roleid, Integer[] pages, Integer[] roleecho);

    /**
     * 查看权限
     *
     * @param roleid
     * @return
     */
    Map<String, Object> selectPower(Integer roleid);
}
