package com.fin.dao;

import com.fin.pojo.PasswordHis;
import com.fin.pojo.PasswordHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasswordHisMapper {
    int countByExample(PasswordHisExample example);

    int deleteByExample(PasswordHisExample example);

    int deleteByPrimaryKey(Integer passhisid);

    int insert(PasswordHis record);

    int insertSelective(PasswordHis record);

    List<PasswordHis> selectByExample(PasswordHisExample example);

    PasswordHis selectByPrimaryKey(Integer passhisid);

    int updateByExampleSelective(@Param("record") PasswordHis record, @Param("example") PasswordHisExample example);

    int updateByExample(@Param("record") PasswordHis record, @Param("example") PasswordHisExample example);

    int updateByPrimaryKeySelective(PasswordHis record);

    int updateByPrimaryKey(PasswordHis record);
}