package com.fin.dao;

import com.fin.pojo.Journal;
import com.fin.pojo.JournalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JournalMapper {
    int countByExample(JournalExample example);

    int deleteByExample(JournalExample example);

    int deleteByPrimaryKey(Integer seqid);

    int insert(Journal record);

    int insertSelective(Journal record);

    List<Journal> selectByExample(JournalExample example);

    Journal selectByPrimaryKey(Integer seqid);

    int updateByExampleSelective(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByExample(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByPrimaryKeySelective(Journal record);

    int updateByPrimaryKey(Journal record);
}