package com.fin.dao;

import com.fin.pojo.SysParams;
import com.fin.pojo.SysParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysParamsMapper {
    int countByExample(SysParamsExample example);

    int deleteByExample(SysParamsExample example);

    int deleteByPrimaryKey(Integer paramid);

    int insert(SysParams record);

    int insertSelective(SysParams record);

    List<SysParams> selectByExample(SysParamsExample example);

    SysParams selectByPrimaryKey(Integer paramid);

    int updateByExampleSelective(@Param("record") SysParams record, @Param("example") SysParamsExample example);

    int updateByExample(@Param("record") SysParams record, @Param("example") SysParamsExample example);

    int updateByPrimaryKeySelective(SysParams record);

    int updateByPrimaryKey(SysParams record);
}