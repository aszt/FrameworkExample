package com.fin.dao;

import com.fin.pojo.Accounts;
import com.fin.pojo.AccountsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AccountsMapper {
    int countByExample(AccountsExample example);

    int deleteByExample(AccountsExample example);

    int deleteByPrimaryKey(Integer acctseqid);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    List<Accounts> selectByExample(AccountsExample example);

    Accounts selectByPrimaryKey(Integer acctseqid);

    int updateByExampleSelective(@Param("record") Accounts record, @Param("example") AccountsExample example);

    int updateByExample(@Param("record") Accounts record, @Param("example") AccountsExample example);

    int updateByPrimaryKeySelective(Accounts record);

    int updateByPrimaryKey(Accounts record);

    Accounts selectByLoginID(String loginid);

    List<Accounts> selectAll(@Param("loginid") String loginid, @Param("acctname") String acctname, @Param("companyname") String companyname, @Param("roleid") Integer roleid, @Param("acctstatus") String acctstatus, @Param("starttime") String starttime, @Param("endtime") String endtime);
}