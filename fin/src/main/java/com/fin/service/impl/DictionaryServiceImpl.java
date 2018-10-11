package com.fin.service.impl;

import com.fin.dao.DictionaryMapper;
import com.fin.pojo.Dictionary;
import com.fin.pojo.DictionaryExample;
import com.fin.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典定义或下拉列表值实现类
 */
@Service("dictionaryService")
public class DictionaryServiceImpl implements IDictionaryService {

    @Autowired
    private DictionaryMapper dictionaryDao;

    @Override
    public List<Dictionary> getDictionaryList(String type) {
        DictionaryExample example = new DictionaryExample();
        example.createCriteria().andClasstypeEqualTo(type);
        return dictionaryDao.selectByExample(example);
    }
}
