package com.fin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PasswordHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PasswordHisExample() {
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

        public Criteria andPasshisidIsNull() {
            addCriterion("PassHisID is null");
            return (Criteria) this;
        }

        public Criteria andPasshisidIsNotNull() {
            addCriterion("PassHisID is not null");
            return (Criteria) this;
        }

        public Criteria andPasshisidEqualTo(Integer value) {
            addCriterion("PassHisID =", value, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidNotEqualTo(Integer value) {
            addCriterion("PassHisID <>", value, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidGreaterThan(Integer value) {
            addCriterion("PassHisID >", value, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PassHisID >=", value, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidLessThan(Integer value) {
            addCriterion("PassHisID <", value, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidLessThanOrEqualTo(Integer value) {
            addCriterion("PassHisID <=", value, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidIn(List<Integer> values) {
            addCriterion("PassHisID in", values, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidNotIn(List<Integer> values) {
            addCriterion("PassHisID not in", values, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidBetween(Integer value1, Integer value2) {
            addCriterion("PassHisID between", value1, value2, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasshisidNotBetween(Integer value1, Integer value2) {
            addCriterion("PassHisID not between", value1, value2, "passhisid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
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