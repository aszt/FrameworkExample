package com.fin.dao;

import com.fin.pojo.Pages;
import com.fin.pojo.PagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PagesMapper {
    int countByExample(PagesExample example);

    int deleteByExample(PagesExample example);

    int deleteByPrimaryKey(Integer pageid);

    int insert(Pages record);

    int insertSelective(Pages record);

    List<Pages> selectByExample(PagesExample example);

    Pages selectByPrimaryKey(Integer pageid);

    int updateByExampleSelective(@Param("record") Pages record, @Param("example") PagesExample example);

    int updateByExample(@Param("record") Pages record, @Param("example") PagesExample example);

    int updateByPrimaryKeySelective(Pages record);

    int updateByPrimaryKey(Pages record);
}