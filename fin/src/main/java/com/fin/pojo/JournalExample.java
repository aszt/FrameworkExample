package com.fin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JournalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JournalExample() {
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

        public Criteria andSeqidIsNull() {
            addCriterion("SeqID is null");
            return (Criteria) this;
        }

        public Criteria andSeqidIsNotNull() {
            addCriterion("SeqID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqidEqualTo(Integer value) {
            addCriterion("SeqID =", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotEqualTo(Integer value) {
            addCriterion("SeqID <>", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThan(Integer value) {
            addCriterion("SeqID >", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SeqID >=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThan(Integer value) {
            addCriterion("SeqID <", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThanOrEqualTo(Integer value) {
            addCriterion("SeqID <=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidIn(List<Integer> values) {
            addCriterion("SeqID in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotIn(List<Integer> values) {
            addCriterion("SeqID not in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidBetween(Integer value1, Integer value2) {
            addCriterion("SeqID between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotBetween(Integer value1, Integer value2) {
            addCriterion("SeqID not between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andJournalidIsNull() {
            addCriterion("JournalID is null");
            return (Criteria) this;
        }

        public Criteria andJournalidIsNotNull() {
            addCriterion("JournalID is not null");
            return (Criteria) this;
        }

        public Criteria andJournalidEqualTo(String value) {
            addCriterion("JournalID =", value, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidNotEqualTo(String value) {
            addCriterion("JournalID <>", value, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidGreaterThan(String value) {
            addCriterion("JournalID >", value, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidGreaterThanOrEqualTo(String value) {
            addCriterion("JournalID >=", value, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidLessThan(String value) {
            addCriterion("JournalID <", value, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidLessThanOrEqualTo(String value) {
            addCriterion("JournalID <=", value, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidLike(String value) {
            addCriterion("JournalID like", value, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidNotLike(String value) {
            addCriterion("JournalID not like", value, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidIn(List<String> values) {
            addCriterion("JournalID in", values, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidNotIn(List<String> values) {
            addCriterion("JournalID not in", values, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidBetween(String value1, String value2) {
            addCriterion("JournalID between", value1, value2, "journalid");
            return (Criteria) this;
        }

        public Criteria andJournalidNotBetween(String value1, String value2) {
            addCriterion("JournalID not between", value1, value2, "journalid");
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

        public Criteria andActiondescIsNull() {
            addCriterion("ActionDesc is null");
            return (Criteria) this;
        }

        public Criteria andActiondescIsNotNull() {
            addCriterion("ActionDesc is not null");
            return (Criteria) this;
        }

        public Criteria andActiondescEqualTo(String value) {
            addCriterion("ActionDesc =", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescNotEqualTo(String value) {
            addCriterion("ActionDesc <>", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescGreaterThan(String value) {
            addCriterion("ActionDesc >", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescGreaterThanOrEqualTo(String value) {
            addCriterion("ActionDesc >=", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescLessThan(String value) {
            addCriterion("ActionDesc <", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescLessThanOrEqualTo(String value) {
            addCriterion("ActionDesc <=", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescLike(String value) {
            addCriterion("ActionDesc like", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescNotLike(String value) {
            addCriterion("ActionDesc not like", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescIn(List<String> values) {
            addCriterion("ActionDesc in", values, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescNotIn(List<String> values) {
            addCriterion("ActionDesc not in", values, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescBetween(String value1, String value2) {
            addCriterion("ActionDesc between", value1, value2, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescNotBetween(String value1, String value2) {
            addCriterion("ActionDesc not between", value1, value2, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andDotimeIsNull() {
            addCriterion("DoTime is null");
            return (Criteria) this;
        }

        public Criteria andDotimeIsNotNull() {
            addCriterion("DoTime is not null");
            return (Criteria) this;
        }

        public Criteria andDotimeEqualTo(Date value) {
            addCriterion("DoTime =", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotEqualTo(Date value) {
            addCriterion("DoTime <>", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeGreaterThan(Date value) {
            addCriterion("DoTime >", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DoTime >=", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLessThan(Date value) {
            addCriterion("DoTime <", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLessThanOrEqualTo(Date value) {
            addCriterion("DoTime <=", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeIn(List<Date> values) {
            addCriterion("DoTime in", values, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotIn(List<Date> values) {
            addCriterion("DoTime not in", values, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeBetween(Date value1, Date value2) {
            addCriterion("DoTime between", value1, value2, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotBetween(Date value1, Date value2) {
            addCriterion("DoTime not between", value1, value2, "dotime");
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