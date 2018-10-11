package com.fin.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysParamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysParamsExample() {
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

        public Criteria andParamidIsNull() {
            addCriterion("ParamID is null");
            return (Criteria) this;
        }

        public Criteria andParamidIsNotNull() {
            addCriterion("ParamID is not null");
            return (Criteria) this;
        }

        public Criteria andParamidEqualTo(Integer value) {
            addCriterion("ParamID =", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidNotEqualTo(Integer value) {
            addCriterion("ParamID <>", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidGreaterThan(Integer value) {
            addCriterion("ParamID >", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParamID >=", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidLessThan(Integer value) {
            addCriterion("ParamID <", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidLessThanOrEqualTo(Integer value) {
            addCriterion("ParamID <=", value, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidIn(List<Integer> values) {
            addCriterion("ParamID in", values, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidNotIn(List<Integer> values) {
            addCriterion("ParamID not in", values, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidBetween(Integer value1, Integer value2) {
            addCriterion("ParamID between", value1, value2, "paramid");
            return (Criteria) this;
        }

        public Criteria andParamidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParamID not between", value1, value2, "paramid");
            return (Criteria) this;
        }

        public Criteria andKeystrIsNull() {
            addCriterion("KeyStr is null");
            return (Criteria) this;
        }

        public Criteria andKeystrIsNotNull() {
            addCriterion("KeyStr is not null");
            return (Criteria) this;
        }

        public Criteria andKeystrEqualTo(String value) {
            addCriterion("KeyStr =", value, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrNotEqualTo(String value) {
            addCriterion("KeyStr <>", value, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrGreaterThan(String value) {
            addCriterion("KeyStr >", value, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrGreaterThanOrEqualTo(String value) {
            addCriterion("KeyStr >=", value, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrLessThan(String value) {
            addCriterion("KeyStr <", value, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrLessThanOrEqualTo(String value) {
            addCriterion("KeyStr <=", value, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrLike(String value) {
            addCriterion("KeyStr like", value, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrNotLike(String value) {
            addCriterion("KeyStr not like", value, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrIn(List<String> values) {
            addCriterion("KeyStr in", values, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrNotIn(List<String> values) {
            addCriterion("KeyStr not in", values, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrBetween(String value1, String value2) {
            addCriterion("KeyStr between", value1, value2, "keystr");
            return (Criteria) this;
        }

        public Criteria andKeystrNotBetween(String value1, String value2) {
            addCriterion("KeyStr not between", value1, value2, "keystr");
            return (Criteria) this;
        }

        public Criteria andValue1IsNull() {
            addCriterion("Value1 is null");
            return (Criteria) this;
        }

        public Criteria andValue1IsNotNull() {
            addCriterion("Value1 is not null");
            return (Criteria) this;
        }

        public Criteria andValue1EqualTo(String value) {
            addCriterion("Value1 =", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotEqualTo(String value) {
            addCriterion("Value1 <>", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThan(String value) {
            addCriterion("Value1 >", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThanOrEqualTo(String value) {
            addCriterion("Value1 >=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThan(String value) {
            addCriterion("Value1 <", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThanOrEqualTo(String value) {
            addCriterion("Value1 <=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Like(String value) {
            addCriterion("Value1 like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotLike(String value) {
            addCriterion("Value1 not like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1In(List<String> values) {
            addCriterion("Value1 in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotIn(List<String> values) {
            addCriterion("Value1 not in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Between(String value1, String value2) {
            addCriterion("Value1 between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotBetween(String value1, String value2) {
            addCriterion("Value1 not between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue2IsNull() {
            addCriterion("Value2 is null");
            return (Criteria) this;
        }

        public Criteria andValue2IsNotNull() {
            addCriterion("Value2 is not null");
            return (Criteria) this;
        }

        public Criteria andValue2EqualTo(String value) {
            addCriterion("Value2 =", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotEqualTo(String value) {
            addCriterion("Value2 <>", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThan(String value) {
            addCriterion("Value2 >", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThanOrEqualTo(String value) {
            addCriterion("Value2 >=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThan(String value) {
            addCriterion("Value2 <", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThanOrEqualTo(String value) {
            addCriterion("Value2 <=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Like(String value) {
            addCriterion("Value2 like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotLike(String value) {
            addCriterion("Value2 not like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2In(List<String> values) {
            addCriterion("Value2 in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotIn(List<String> values) {
            addCriterion("Value2 not in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Between(String value1, String value2) {
            addCriterion("Value2 between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotBetween(String value1, String value2) {
            addCriterion("Value2 not between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andTypestrIsNull() {
            addCriterion("TypeStr is null");
            return (Criteria) this;
        }

        public Criteria andTypestrIsNotNull() {
            addCriterion("TypeStr is not null");
            return (Criteria) this;
        }

        public Criteria andTypestrEqualTo(String value) {
            addCriterion("TypeStr =", value, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrNotEqualTo(String value) {
            addCriterion("TypeStr <>", value, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrGreaterThan(String value) {
            addCriterion("TypeStr >", value, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrGreaterThanOrEqualTo(String value) {
            addCriterion("TypeStr >=", value, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrLessThan(String value) {
            addCriterion("TypeStr <", value, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrLessThanOrEqualTo(String value) {
            addCriterion("TypeStr <=", value, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrLike(String value) {
            addCriterion("TypeStr like", value, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrNotLike(String value) {
            addCriterion("TypeStr not like", value, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrIn(List<String> values) {
            addCriterion("TypeStr in", values, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrNotIn(List<String> values) {
            addCriterion("TypeStr not in", values, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrBetween(String value1, String value2) {
            addCriterion("TypeStr between", value1, value2, "typestr");
            return (Criteria) this;
        }

        public Criteria andTypestrNotBetween(String value1, String value2) {
            addCriterion("TypeStr not between", value1, value2, "typestr");
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