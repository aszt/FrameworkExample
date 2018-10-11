package com.fin.dao;

import com.fin.pojo.RolePage;
import com.fin.pojo.RolePageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePageMapper {
    int countByExample(RolePageExample example);

    int deleteByExample(RolePageExample example);

    int insert(RolePage record);

    int insertSelective(RolePage record);

    List<RolePage> selectByExample(RolePageExample example);

    int updateByExampleSelective(@Param("record") RolePage record, @Param("example") RolePageExample example);

    int updateByExample(@Param("record") RolePage record, @Param("example") RolePageExample example);
}