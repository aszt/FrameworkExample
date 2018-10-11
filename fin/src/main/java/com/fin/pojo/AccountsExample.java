package com.fin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountsExample() {
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

        public Criteria andAcctseqidIsNull() {
            addCriterion("AcctSeqID is null");
            return (Criteria) this;
        }

        public Criteria andAcctseqidIsNotNull() {
            addCriterion("AcctSeqID is not null");
            return (Criteria) this;
        }

        public Criteria andAcctseqidEqualTo(Integer value) {
            addCriterion("AcctSeqID =", value, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidNotEqualTo(Integer value) {
            addCriterion("AcctSeqID <>", value, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidGreaterThan(Integer value) {
            addCriterion("AcctSeqID >", value, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AcctSeqID >=", value, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidLessThan(Integer value) {
            addCriterion("AcctSeqID <", value, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidLessThanOrEqualTo(Integer value) {
            addCriterion("AcctSeqID <=", value, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidIn(List<Integer> values) {
            addCriterion("AcctSeqID in", values, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidNotIn(List<Integer> values) {
            addCriterion("AcctSeqID not in", values, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidBetween(Integer value1, Integer value2) {
            addCriterion("AcctSeqID between", value1, value2, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andAcctseqidNotBetween(Integer value1, Integer value2) {
            addCriterion("AcctSeqID not between", value1, value2, "acctseqid");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNull() {
            addCriterion("LoginID is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("LoginID is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(String value) {
            addCriterion("LoginID =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(String value) {
            addCriterion("LoginID <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(String value) {
            addCriterion("LoginID >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("LoginID >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(String value) {
            addCriterion("LoginID <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(String value) {
            addCriterion("LoginID <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLike(String value) {
            addCriterion("LoginID like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotLike(String value) {
            addCriterion("LoginID not like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<String> values) {
            addCriterion("LoginID in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<String> values) {
            addCriterion("LoginID not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(String value1, String value2) {
            addCriterion("LoginID between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(String value1, String value2) {
            addCriterion("LoginID not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoIsNull() {
            addCriterion("AcctMobileNo is null");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoIsNotNull() {
            addCriterion("AcctMobileNo is not null");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoEqualTo(String value) {
            addCriterion("AcctMobileNo =", value, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoNotEqualTo(String value) {
            addCriterion("AcctMobileNo <>", value, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoGreaterThan(String value) {
            addCriterion("AcctMobileNo >", value, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("AcctMobileNo >=", value, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoLessThan(String value) {
            addCriterion("AcctMobileNo <", value, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoLessThanOrEqualTo(String value) {
            addCriterion("AcctMobileNo <=", value, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoLike(String value) {
            addCriterion("AcctMobileNo like", value, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoNotLike(String value) {
            addCriterion("AcctMobileNo not like", value, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoIn(List<String> values) {
            addCriterion("AcctMobileNo in", values, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoNotIn(List<String> values) {
            addCriterion("AcctMobileNo not in", values, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoBetween(String value1, String value2) {
            addCriterion("AcctMobileNo between", value1, value2, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctmobilenoNotBetween(String value1, String value2) {
            addCriterion("AcctMobileNo not between", value1, value2, "acctmobileno");
            return (Criteria) this;
        }

        public Criteria andAcctemailIsNull() {
            addCriterion("AcctEmail is null");
            return (Criteria) this;
        }

        public Criteria andAcctemailIsNotNull() {
            addCriterion("AcctEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAcctemailEqualTo(String value) {
            addCriterion("AcctEmail =", value, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailNotEqualTo(String value) {
            addCriterion("AcctEmail <>", value, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailGreaterThan(String value) {
            addCriterion("AcctEmail >", value, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailGreaterThanOrEqualTo(String value) {
            addCriterion("AcctEmail >=", value, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailLessThan(String value) {
            addCriterion("AcctEmail <", value, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailLessThanOrEqualTo(String value) {
            addCriterion("AcctEmail <=", value, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailLike(String value) {
            addCriterion("AcctEmail like", value, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailNotLike(String value) {
            addCriterion("AcctEmail not like", value, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailIn(List<String> values) {
            addCriterion("AcctEmail in", values, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailNotIn(List<String> values) {
            addCriterion("AcctEmail not in", values, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailBetween(String value1, String value2) {
            addCriterion("AcctEmail between", value1, value2, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctemailNotBetween(String value1, String value2) {
            addCriterion("AcctEmail not between", value1, value2, "acctemail");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordIsNull() {
            addCriterion("AcctPassword is null");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordIsNotNull() {
            addCriterion("AcctPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordEqualTo(String value) {
            addCriterion("AcctPassword =", value, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordNotEqualTo(String value) {
            addCriterion("AcctPassword <>", value, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordGreaterThan(String value) {
            addCriterion("AcctPassword >", value, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AcctPassword >=", value, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordLessThan(String value) {
            addCriterion("AcctPassword <", value, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordLessThanOrEqualTo(String value) {
            addCriterion("AcctPassword <=", value, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordLike(String value) {
            addCriterion("AcctPassword like", value, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordNotLike(String value) {
            addCriterion("AcctPassword not like", value, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordIn(List<String> values) {
            addCriterion("AcctPassword in", values, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordNotIn(List<String> values) {
            addCriterion("AcctPassword not in", values, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordBetween(String value1, String value2) {
            addCriterion("AcctPassword between", value1, value2, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctpasswordNotBetween(String value1, String value2) {
            addCriterion("AcctPassword not between", value1, value2, "acctpassword");
            return (Criteria) this;
        }

        public Criteria andAcctnameIsNull() {
            addCriterion("AcctName is null");
            return (Criteria) this;
        }

        public Criteria andAcctnameIsNotNull() {
            addCriterion("AcctName is not null");
            return (Criteria) this;
        }

        public Criteria andAcctnameEqualTo(String value) {
            addCriterion("AcctName =", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotEqualTo(String value) {
            addCriterion("AcctName <>", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameGreaterThan(String value) {
            addCriterion("AcctName >", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameGreaterThanOrEqualTo(String value) {
            addCriterion("AcctName >=", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLessThan(String value) {
            addCriterion("AcctName <", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLessThanOrEqualTo(String value) {
            addCriterion("AcctName <=", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLike(String value) {
            addCriterion("AcctName like", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotLike(String value) {
            addCriterion("AcctName not like", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameIn(List<String> values) {
            addCriterion("AcctName in", values, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotIn(List<String> values) {
            addCriterion("AcctName not in", values, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameBetween(String value1, String value2) {
            addCriterion("AcctName between", value1, value2, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotBetween(String value1, String value2) {
            addCriterion("AcctName not between", value1, value2, "acctname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAcctstatusIsNull() {
            addCriterion("AcctStatus is null");
            return (Criteria) this;
        }

        public Criteria andAcctstatusIsNotNull() {
            addCriterion("AcctStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAcctstatusEqualTo(String value) {
            addCriterion("AcctStatus =", value, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusNotEqualTo(String value) {
            addCriterion("AcctStatus <>", value, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusGreaterThan(String value) {
            addCriterion("AcctStatus >", value, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusGreaterThanOrEqualTo(String value) {
            addCriterion("AcctStatus >=", value, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusLessThan(String value) {
            addCriterion("AcctStatus <", value, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusLessThanOrEqualTo(String value) {
            addCriterion("AcctStatus <=", value, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusLike(String value) {
            addCriterion("AcctStatus like", value, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusNotLike(String value) {
            addCriterion("AcctStatus not like", value, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusIn(List<String> values) {
            addCriterion("AcctStatus in", values, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusNotIn(List<String> values) {
            addCriterion("AcctStatus not in", values, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusBetween(String value1, String value2) {
            addCriterion("AcctStatus between", value1, value2, "acctstatus");
            return (Criteria) this;
        }

        public Criteria andAcctstatusNotBetween(String value1, String value2) {
            addCriterion("AcctStatus not between", value1, value2, "acctstatus");
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

        public Criteria andIntegrationIsNull() {
            addCriterion("Integration is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNotNull() {
            addCriterion("Integration is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationEqualTo(String value) {
            addCriterion("Integration =", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotEqualTo(String value) {
            addCriterion("Integration <>", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThan(String value) {
            addCriterion("Integration >", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThanOrEqualTo(String value) {
            addCriterion("Integration >=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThan(String value) {
            addCriterion("Integration <", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThanOrEqualTo(String value) {
            addCriterion("Integration <=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLike(String value) {
            addCriterion("Integration like", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotLike(String value) {
            addCriterion("Integration not like", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationIn(List<String> values) {
            addCriterion("Integration in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotIn(List<String> values) {
            addCriterion("Integration not in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationBetween(String value1, String value2) {
            addCriterion("Integration between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotBetween(String value1, String value2) {
            addCriterion("Integration not between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WeChat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WeChat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WeChat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WeChat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WeChat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WeChat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WeChat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WeChat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WeChat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WeChat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WeChat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WeChat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WeChat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWeiboIsNull() {
            addCriterion("Weibo is null");
            return (Criteria) this;
        }

        public Criteria andWeiboIsNotNull() {
            addCriterion("Weibo is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboEqualTo(String value) {
            addCriterion("Weibo =", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotEqualTo(String value) {
            addCriterion("Weibo <>", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboGreaterThan(String value) {
            addCriterion("Weibo >", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboGreaterThanOrEqualTo(String value) {
            addCriterion("Weibo >=", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLessThan(String value) {
            addCriterion("Weibo <", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLessThanOrEqualTo(String value) {
            addCriterion("Weibo <=", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLike(String value) {
            addCriterion("Weibo like", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotLike(String value) {
            addCriterion("Weibo not like", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboIn(List<String> values) {
            addCriterion("Weibo in", values, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotIn(List<String> values) {
            addCriterion("Weibo not in", values, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboBetween(String value1, String value2) {
            addCriterion("Weibo between", value1, value2, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotBetween(String value1, String value2) {
            addCriterion("Weibo not between", value1, value2, "weibo");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNull() {
            addCriterion("AliPay is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNotNull() {
            addCriterion("AliPay is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayEqualTo(String value) {
            addCriterion("AliPay =", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotEqualTo(String value) {
            addCriterion("AliPay <>", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThan(String value) {
            addCriterion("AliPay >", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThanOrEqualTo(String value) {
            addCriterion("AliPay >=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThan(String value) {
            addCriterion("AliPay <", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThanOrEqualTo(String value) {
            addCriterion("AliPay <=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLike(String value) {
            addCriterion("AliPay like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotLike(String value) {
            addCriterion("AliPay not like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayIn(List<String> values) {
            addCriterion("AliPay in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotIn(List<String> values) {
            addCriterion("AliPay not in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayBetween(String value1, String value2) {
            addCriterion("AliPay between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotBetween(String value1, String value2) {
            addCriterion("AliPay not between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andTaobaoIsNull() {
            addCriterion("Taobao is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoIsNotNull() {
            addCriterion("Taobao is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoEqualTo(String value) {
            addCriterion("Taobao =", value, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoNotEqualTo(String value) {
            addCriterion("Taobao <>", value, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoGreaterThan(String value) {
            addCriterion("Taobao >", value, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoGreaterThanOrEqualTo(String value) {
            addCriterion("Taobao >=", value, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoLessThan(String value) {
            addCriterion("Taobao <", value, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoLessThanOrEqualTo(String value) {
            addCriterion("Taobao <=", value, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoLike(String value) {
            addCriterion("Taobao like", value, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoNotLike(String value) {
            addCriterion("Taobao not like", value, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoIn(List<String> values) {
            addCriterion("Taobao in", values, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoNotIn(List<String> values) {
            addCriterion("Taobao not in", values, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoBetween(String value1, String value2) {
            addCriterion("Taobao between", value1, value2, "taobao");
            return (Criteria) this;
        }

        public Criteria andTaobaoNotBetween(String value1, String value2) {
            addCriterion("Taobao not between", value1, value2, "taobao");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("Others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("Others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("Others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("Others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("Others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("Others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("Others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("Others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("Others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("Others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("Others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("Others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("Others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("Others not between", value1, value2, "others");
            return (Criteria) this;
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

        public Criteria andCreatedflagIsNull() {
            addCriterion("CreatedFlag is null");
            return (Criteria) this;
        }

        public Criteria andCreatedflagIsNotNull() {
            addCriterion("CreatedFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedflagEqualTo(String value) {
            addCriterion("CreatedFlag =", value, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagNotEqualTo(String value) {
            addCriterion("CreatedFlag <>", value, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagGreaterThan(String value) {
            addCriterion("CreatedFlag >", value, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedFlag >=", value, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagLessThan(String value) {
            addCriterion("CreatedFlag <", value, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagLessThanOrEqualTo(String value) {
            addCriterion("CreatedFlag <=", value, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagLike(String value) {
            addCriterion("CreatedFlag like", value, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagNotLike(String value) {
            addCriterion("CreatedFlag not like", value, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagIn(List<String> values) {
            addCriterion("CreatedFlag in", values, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagNotIn(List<String> values) {
            addCriterion("CreatedFlag not in", values, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagBetween(String value1, String value2) {
            addCriterion("CreatedFlag between", value1, value2, "createdflag");
            return (Criteria) this;
        }

        public Criteria andCreatedflagNotBetween(String value1, String value2) {
            addCriterion("CreatedFlag not between", value1, value2, "createdflag");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("LastLogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("LastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Date value) {
            addCriterion("LastLogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Date value) {
            addCriterion("LastLogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Date value) {
            addCriterion("LastLogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Date value) {
            addCriterion("LastLogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Date value) {
            addCriterion("LastLogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Date> values) {
            addCriterion("LastLogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Date> values) {
            addCriterion("LastLogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Date value1, Date value2) {
            addCriterion("LastLogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Date value1, Date value2) {
            addCriterion("LastLogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeIsNull() {
            addCriterion("PassErrorTime is null");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeIsNotNull() {
            addCriterion("PassErrorTime is not null");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeEqualTo(Integer value) {
            addCriterion("PassErrorTime =", value, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeNotEqualTo(Integer value) {
            addCriterion("PassErrorTime <>", value, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeGreaterThan(Integer value) {
            addCriterion("PassErrorTime >", value, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PassErrorTime >=", value, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeLessThan(Integer value) {
            addCriterion("PassErrorTime <", value, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeLessThanOrEqualTo(Integer value) {
            addCriterion("PassErrorTime <=", value, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeIn(List<Integer> values) {
            addCriterion("PassErrorTime in", values, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeNotIn(List<Integer> values) {
            addCriterion("PassErrorTime not in", values, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeBetween(Integer value1, Integer value2) {
            addCriterion("PassErrorTime between", value1, value2, "passerrortime");
            return (Criteria) this;
        }

        public Criteria andPasserrortimeNotBetween(Integer value1, Integer value2) {
            addCriterion("PassErrorTime not between", value1, value2, "passerrortime");
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