package com.fin.dao;

import com.fin.pojo.Sequence;
import com.fin.pojo.SequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceMapper {
    int countByExample(SequenceExample example);

    int deleteByExample(SequenceExample example);

    int deleteByPrimaryKey(Integer sequenceid);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    List<Sequence> selectByExample(SequenceExample example);

    Sequence selectByPrimaryKey(Integer sequenceid);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByPrimaryKeySelective(Sequence record);

    int updateByPrimaryKey(Sequence record);
}