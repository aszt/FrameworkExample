package com.fin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SequenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SequenceExample() {
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

        public Criteria andSequenceidIsNull() {
            addCriterion("SequenceId is null");
            return (Criteria) this;
        }

        public Criteria andSequenceidIsNotNull() {
            addCriterion("SequenceId is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceidEqualTo(Integer value) {
            addCriterion("SequenceId =", value, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidNotEqualTo(Integer value) {
            addCriterion("SequenceId <>", value, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidGreaterThan(Integer value) {
            addCriterion("SequenceId >", value, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SequenceId >=", value, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidLessThan(Integer value) {
            addCriterion("SequenceId <", value, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidLessThanOrEqualTo(Integer value) {
            addCriterion("SequenceId <=", value, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidIn(List<Integer> values) {
            addCriterion("SequenceId in", values, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidNotIn(List<Integer> values) {
            addCriterion("SequenceId not in", values, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidBetween(Integer value1, Integer value2) {
            addCriterion("SequenceId between", value1, value2, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andSequenceidNotBetween(Integer value1, Integer value2) {
            addCriterion("SequenceId not between", value1, value2, "sequenceid");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNull() {
            addCriterion("ActionTime is null");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNotNull() {
            addCriterion("ActionTime is not null");
            return (Criteria) this;
        }

        public Criteria andActiontimeEqualTo(Date value) {
            addCriterion("ActionTime =", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotEqualTo(Date value) {
            addCriterion("ActionTime <>", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThan(Date value) {
            addCriterion("ActionTime >", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ActionTime >=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThan(Date value) {
            addCriterion("ActionTime <", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThanOrEqualTo(Date value) {
            addCriterion("ActionTime <=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeIn(List<Date> values) {
            addCriterion("ActionTime in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotIn(List<Date> values) {
            addCriterion("ActionTime not in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeBetween(Date value1, Date value2) {
            addCriterion("ActionTime between", value1, value2, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotBetween(Date value1, Date value2) {
            addCriterion("ActionTime not between", value1, value2, "actiontime");
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