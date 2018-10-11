package com.fin.service;

import com.fin.pojo.Dictionary;

import java.util.List;

/**
 * 字典定义或下拉列表值接口
 */
public interface IDictionaryService {
    List<Dictionary> getDictionaryList(String type);
}
