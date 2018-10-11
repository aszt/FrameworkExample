package com.fin.dao;

import com.fin.pojo.Merchant;
import com.fin.pojo.MerchantExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MerchantMapper {
    int countByExample(MerchantExample example);

    int deleteByExample(MerchantExample example);

    int deleteByPrimaryKey(Integer merid);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    List<Merchant> selectByExample(MerchantExample example);

    Merchant selectByPrimaryKey(Integer merid);

    int updateByExampleSelective(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByExample(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);

    List<Merchant> selectAll(@Param("merchantno") String merchantno, @Param("companyname") String companyname, @Param("name") String name, @Param("parentcompany") String parentcompany, @Param("orgtype") String orgtype, @Param("orgstatus") String orgstatus, @Param("starttime") String starttime, @Param("endtime") String endtime);
}