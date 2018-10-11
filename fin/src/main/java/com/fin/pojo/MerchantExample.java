package com.fin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMeridIsNull() {
            addCriterion("MerID is null");
            return (Criteria) this;
        }

        public Criteria andMeridIsNotNull() {
            addCriterion("MerID is not null");
            return (Criteria) this;
        }

        public Criteria andMeridEqualTo(Integer value) {
            addCriterion("MerID =", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotEqualTo(Integer value) {
            addCriterion("MerID <>", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridGreaterThan(Integer value) {
            addCriterion("MerID >", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("MerID >=", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridLessThan(Integer value) {
            addCriterion("MerID <", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridLessThanOrEqualTo(Integer value) {
            addCriterion("MerID <=", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridIn(List<Integer> values) {
            addCriterion("MerID in", values, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotIn(List<Integer> values) {
            addCriterion("MerID not in", values, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridBetween(Integer value1, Integer value2) {
            addCriterion("MerID between", value1, value2, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotBetween(Integer value1, Integer value2) {
            addCriterion("MerID not between", value1, value2, "merid");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIsNull() {
            addCriterion("MerchantNo is null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIsNotNull() {
            addCriterion("MerchantNo is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoEqualTo(String value) {
            addCriterion("MerchantNo =", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotEqualTo(String value) {
            addCriterion("MerchantNo <>", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThan(String value) {
            addCriterion("MerchantNo >", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantNo >=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThan(String value) {
            addCriterion("MerchantNo <", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThanOrEqualTo(String value) {
            addCriterion("MerchantNo <=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLike(String value) {
            addCriterion("MerchantNo like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotLike(String value) {
            addCriterion("MerchantNo not like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIn(List<String> values) {
            addCriterion("MerchantNo in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotIn(List<String> values) {
            addCriterion("MerchantNo not in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoBetween(String value1, String value2) {
            addCriterion("MerchantNo between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotBetween(String value1, String value2) {
            addCriterion("MerchantNo not between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("MobileNo is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("MobileNo is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(String value) {
            addCriterion("MobileNo =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(String value) {
            addCriterion("MobileNo <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(String value) {
            addCriterion("MobileNo >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("MobileNo >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(String value) {
            addCriterion("MobileNo <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(String value) {
            addCriterion("MobileNo <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLike(String value) {
            addCriterion("MobileNo like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotLike(String value) {
            addCriterion("MobileNo not like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<String> values) {
            addCriterion("MobileNo in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<String> values) {
            addCriterion("MobileNo not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(String value1, String value2) {
            addCriterion("MobileNo between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(String value1, String value2) {
            addCriterion("MobileNo not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andNameabbrIsNull() {
            addCriterion("NameAbbr is null");
            return (Criteria) this;
        }

        public Criteria andNameabbrIsNotNull() {
            addCriterion("NameAbbr is not null");
            return (Criteria) this;
        }

        public Criteria andNameabbrEqualTo(String value) {
            addCriterion("NameAbbr =", value, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrNotEqualTo(String value) {
            addCriterion("NameAbbr <>", value, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrGreaterThan(String value) {
            addCriterion("NameAbbr >", value, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrGreaterThanOrEqualTo(String value) {
            addCriterion("NameAbbr >=", value, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrLessThan(String value) {
            addCriterion("NameAbbr <", value, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrLessThanOrEqualTo(String value) {
            addCriterion("NameAbbr <=", value, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrLike(String value) {
            addCriterion("NameAbbr like", value, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrNotLike(String value) {
            addCriterion("NameAbbr not like", value, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrIn(List<String> values) {
            addCriterion("NameAbbr in", values, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrNotIn(List<String> values) {
            addCriterion("NameAbbr not in", values, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrBetween(String value1, String value2) {
            addCriterion("NameAbbr between", value1, value2, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andNameabbrNotBetween(String value1, String value2) {
            addCriterion("NameAbbr not between", value1, value2, "nameabbr");
            return (Criteria) this;
        }

        public Criteria andMeremailIsNull() {
            addCriterion("MerEmail is null");
            return (Criteria) this;
        }

        public Criteria andMeremailIsNotNull() {
            addCriterion("MerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andMeremailEqualTo(String value) {
            addCriterion("MerEmail =", value, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailNotEqualTo(String value) {
            addCriterion("MerEmail <>", value, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailGreaterThan(String value) {
            addCriterion("MerEmail >", value, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailGreaterThanOrEqualTo(String value) {
            addCriterion("MerEmail >=", value, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailLessThan(String value) {
            addCriterion("MerEmail <", value, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailLessThanOrEqualTo(String value) {
            addCriterion("MerEmail <=", value, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailLike(String value) {
            addCriterion("MerEmail like", value, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailNotLike(String value) {
            addCriterion("MerEmail not like", value, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailIn(List<String> values) {
            addCriterion("MerEmail in", values, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailNotIn(List<String> values) {
            addCriterion("MerEmail not in", values, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailBetween(String value1, String value2) {
            addCriterion("MerEmail between", value1, value2, "meremail");
            return (Criteria) this;
        }

        public Criteria andMeremailNotBetween(String value1, String value2) {
            addCriterion("MerEmail not between", value1, value2, "meremail");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("ImgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("ImgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("ImgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("ImgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("ImgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("ImgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("ImgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("ImgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("ImgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("ImgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("ImgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("ImgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("ImgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("ImgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andLevelinIsNull() {
            addCriterion("LevelIn is null");
            return (Criteria) this;
        }

        public Criteria andLevelinIsNotNull() {
            addCriterion("LevelIn is not null");
            return (Criteria) this;
        }

        public Criteria andLevelinEqualTo(Integer value) {
            addCriterion("LevelIn =", value, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinNotEqualTo(Integer value) {
            addCriterion("LevelIn <>", value, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinGreaterThan(Integer value) {
            addCriterion("LevelIn >", value, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinGreaterThanOrEqualTo(Integer value) {
            addCriterion("LevelIn >=", value, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinLessThan(Integer value) {
            addCriterion("LevelIn <", value, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinLessThanOrEqualTo(Integer value) {
            addCriterion("LevelIn <=", value, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinIn(List<Integer> values) {
            addCriterion("LevelIn in", values, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinNotIn(List<Integer> values) {
            addCriterion("LevelIn not in", values, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinBetween(Integer value1, Integer value2) {
            addCriterion("LevelIn between", value1, value2, "levelin");
            return (Criteria) this;
        }

        public Criteria andLevelinNotBetween(Integer value1, Integer value2) {
            addCriterion("LevelIn not between", value1, value2, "levelin");
            return (Criteria) this;
        }

        public Criteria andIsdepositIsNull() {
            addCriterion("IsDeposit is null");
            return (Criteria) this;
        }

        public Criteria andIsdepositIsNotNull() {
            addCriterion("IsDeposit is not null");
            return (Criteria) this;
        }

        public Criteria andIsdepositEqualTo(String value) {
            addCriterion("IsDeposit =", value, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositNotEqualTo(String value) {
            addCriterion("IsDeposit <>", value, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositGreaterThan(String value) {
            addCriterion("IsDeposit >", value, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositGreaterThanOrEqualTo(String value) {
            addCriterion("IsDeposit >=", value, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositLessThan(String value) {
            addCriterion("IsDeposit <", value, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositLessThanOrEqualTo(String value) {
            addCriterion("IsDeposit <=", value, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositLike(String value) {
            addCriterion("IsDeposit like", value, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositNotLike(String value) {
            addCriterion("IsDeposit not like", value, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositIn(List<String> values) {
            addCriterion("IsDeposit in", values, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositNotIn(List<String> values) {
            addCriterion("IsDeposit not in", values, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositBetween(String value1, String value2) {
            addCriterion("IsDeposit between", value1, value2, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andIsdepositNotBetween(String value1, String value2) {
            addCriterion("IsDeposit not between", value1, value2, "isdeposit");
            return (Criteria) this;
        }

        public Criteria andOrgstatusIsNull() {
            addCriterion("OrgStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrgstatusIsNotNull() {
            addCriterion("OrgStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrgstatusEqualTo(String value) {
            addCriterion("OrgStatus =", value, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusNotEqualTo(String value) {
            addCriterion("OrgStatus <>", value, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusGreaterThan(String value) {
            addCriterion("OrgStatus >", value, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusGreaterThanOrEqualTo(String value) {
            addCriterion("OrgStatus >=", value, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusLessThan(String value) {
            addCriterion("OrgStatus <", value, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusLessThanOrEqualTo(String value) {
            addCriterion("OrgStatus <=", value, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusLike(String value) {
            addCriterion("OrgStatus like", value, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusNotLike(String value) {
            addCriterion("OrgStatus not like", value, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusIn(List<String> values) {
            addCriterion("OrgStatus in", values, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusNotIn(List<String> values) {
            addCriterion("OrgStatus not in", values, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusBetween(String value1, String value2) {
            addCriterion("OrgStatus between", value1, value2, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgstatusNotBetween(String value1, String value2) {
            addCriterion("OrgStatus not between", value1, value2, "orgstatus");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIsNull() {
            addCriterion("OrgType is null");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIsNotNull() {
            addCriterion("OrgType is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtypeEqualTo(String value) {
            addCriterion("OrgType =", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotEqualTo(String value) {
            addCriterion("OrgType <>", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeGreaterThan(String value) {
            addCriterion("OrgType >", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("OrgType >=", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLessThan(String value) {
            addCriterion("OrgType <", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLessThanOrEqualTo(String value) {
            addCriterion("OrgType <=", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLike(String value) {
            addCriterion("OrgType like", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotLike(String value) {
            addCriterion("OrgType not like", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIn(List<String> values) {
            addCriterion("OrgType in", values, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotIn(List<String> values) {
            addCriterion("OrgType not in", values, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeBetween(String value1, String value2) {
            addCriterion("OrgType between", value1, value2, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotBetween(String value1, String value2) {
            addCriterion("OrgType not between", value1, value2, "orgtype");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyIsNull() {
            addCriterion("WorkFlowKey is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyIsNotNull() {
            addCriterion("WorkFlowKey is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyEqualTo(String value) {
            addCriterion("WorkFlowKey =", value, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyNotEqualTo(String value) {
            addCriterion("WorkFlowKey <>", value, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyGreaterThan(String value) {
            addCriterion("WorkFlowKey >", value, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyGreaterThanOrEqualTo(String value) {
            addCriterion("WorkFlowKey >=", value, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyLessThan(String value) {
            addCriterion("WorkFlowKey <", value, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyLessThanOrEqualTo(String value) {
            addCriterion("WorkFlowKey <=", value, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyLike(String value) {
            addCriterion("WorkFlowKey like", value, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyNotLike(String value) {
            addCriterion("WorkFlowKey not like", value, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyIn(List<String> values) {
            addCriterion("WorkFlowKey in", values, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyNotIn(List<String> values) {
            addCriterion("WorkFlowKey not in", values, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyBetween(String value1, String value2) {
            addCriterion("WorkFlowKey between", value1, value2, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andWorkflowkeyNotBetween(String value1, String value2) {
            addCriterion("WorkFlowKey not between", value1, value2, "workflowkey");
            return (Criteria) this;
        }

        public Criteria andMerapplyidIsNull() {
            addCriterion("MerApplyID is null");
            return (Criteria) this;
        }

        public Criteria andMerapplyidIsNotNull() {
            addCriterion("MerApplyID is not null");
            return (Criteria) this;
        }

        public Criteria andMerapplyidEqualTo(Integer value) {
            addCriterion("MerApplyID =", value, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidNotEqualTo(Integer value) {
            addCriterion("MerApplyID <>", value, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidGreaterThan(Integer value) {
            addCriterion("MerApplyID >", value, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MerApplyID >=", value, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidLessThan(Integer value) {
            addCriterion("MerApplyID <", value, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidLessThanOrEqualTo(Integer value) {
            addCriterion("MerApplyID <=", value, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidIn(List<Integer> values) {
            addCriterion("MerApplyID in", values, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidNotIn(List<Integer> values) {
            addCriterion("MerApplyID not in", values, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidBetween(Integer value1, Integer value2) {
            addCriterion("MerApplyID between", value1, value2, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andMerapplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("MerApplyID not between", value1, value2, "merapplyid");
            return (Criteria) this;
        }

        public Criteria andCreatedatIsNull() {
            addCriterion("CreatedAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedatIsNotNull() {
            addCriterion("CreatedAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedatEqualTo(Date value) {
            addCriterion("CreatedAt =", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotEqualTo(Date value) {
            addCriterion("CreatedAt <>", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatGreaterThan(Date value) {
            addCriterion("CreatedAt >", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedAt >=", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatLessThan(Date value) {
            addCriterion("CreatedAt <", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatLessThanOrEqualTo(Date value) {
            addCriterion("CreatedAt <=", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatIn(List<Date> values) {
            addCriterion("CreatedAt in", values, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotIn(List<Date> values) {
            addCriterion("CreatedAt not in", values, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatBetween(Date value1, Date value2) {
            addCriterion("CreatedAt between", value1, value2, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotBetween(Date value1, Date value2) {
            addCriterion("CreatedAt not between", value1, value2, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CreatedBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CreatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Integer value) {
            addCriterion("CreatedBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Integer value) {
            addCriterion("CreatedBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Integer value) {
            addCriterion("CreatedBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreatedBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Integer value) {
            addCriterion("CreatedBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Integer value) {
            addCriterion("CreatedBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Integer> values) {
            addCriterion("CreatedBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Integer> values) {
            addCriterion("CreatedBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Integer value1, Integer value2) {
            addCriterion("CreatedBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Integer value1, Integer value2) {
            addCriterion("CreatedBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIsNull() {
            addCriterion("UpdatedAt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIsNotNull() {
            addCriterion("UpdatedAt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedatEqualTo(Date value) {
            addCriterion("UpdatedAt =", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotEqualTo(Date value) {
            addCriterion("UpdatedAt <>", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatGreaterThan(Date value) {
            addCriterion("UpdatedAt >", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdatedAt >=", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatLessThan(Date value) {
            addCriterion("UpdatedAt <", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatLessThanOrEqualTo(Date value) {
            addCriterion("UpdatedAt <=", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIn(List<Date> values) {
            addCriterion("UpdatedAt in", values, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotIn(List<Date> values) {
            addCriterion("UpdatedAt not in", values, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatBetween(Date value1, Date value2) {
            addCriterion("UpdatedAt between", value1, value2, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotBetween(Date value1, Date value2) {
            addCriterion("UpdatedAt not between", value1, value2, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIsNull() {
            addCriterion("UpdatedBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIsNotNull() {
            addCriterion("UpdatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyEqualTo(Integer value) {
            addCriterion("UpdatedBy =", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotEqualTo(Integer value) {
            addCriterion("UpdatedBy <>", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyGreaterThan(Integer value) {
            addCriterion("UpdatedBy >", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpdatedBy >=", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLessThan(Integer value) {
            addCriterion("UpdatedBy <", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLessThanOrEqualTo(Integer value) {
            addCriterion("UpdatedBy <=", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIn(List<Integer> values) {
            addCriterion("UpdatedBy in", values, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotIn(List<Integer> values) {
            addCriterion("UpdatedBy not in", values, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyBetween(Integer value1, Integer value2) {
            addCriterion("UpdatedBy between", value1, value2, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotBetween(Integer value1, Integer value2) {
            addCriterion("UpdatedBy not between", value1, value2, "updatedby");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}