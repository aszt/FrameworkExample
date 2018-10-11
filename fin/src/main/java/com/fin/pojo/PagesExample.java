package com.fin.pojo;

import java.util.ArrayList;
import java.util.List;

public class PagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PagesExample() {
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

        public Criteria andPageidIsNull() {
            addCriterion("PageID is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("PageID is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(Integer value) {
            addCriterion("PageID =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(Integer value) {
            addCriterion("PageID <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(Integer value) {
            addCriterion("PageID >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PageID >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(Integer value) {
            addCriterion("PageID <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(Integer value) {
            addCriterion("PageID <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<Integer> values) {
            addCriterion("PageID in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<Integer> values) {
            addCriterion("PageID not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(Integer value1, Integer value2) {
            addCriterion("PageID between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(Integer value1, Integer value2) {
            addCriterion("PageID not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPagekeyIsNull() {
            addCriterion("PageKey is null");
            return (Criteria) this;
        }

        public Criteria andPagekeyIsNotNull() {
            addCriterion("PageKey is not null");
            return (Criteria) this;
        }

        public Criteria andPagekeyEqualTo(String value) {
            addCriterion("PageKey =", value, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyNotEqualTo(String value) {
            addCriterion("PageKey <>", value, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyGreaterThan(String value) {
            addCriterion("PageKey >", value, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyGreaterThanOrEqualTo(String value) {
            addCriterion("PageKey >=", value, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyLessThan(String value) {
            addCriterion("PageKey <", value, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyLessThanOrEqualTo(String value) {
            addCriterion("PageKey <=", value, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyLike(String value) {
            addCriterion("PageKey like", value, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyNotLike(String value) {
            addCriterion("PageKey not like", value, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyIn(List<String> values) {
            addCriterion("PageKey in", values, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyNotIn(List<String> values) {
            addCriterion("PageKey not in", values, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyBetween(String value1, String value2) {
            addCriterion("PageKey between", value1, value2, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagekeyNotBetween(String value1, String value2) {
            addCriterion("PageKey not between", value1, value2, "pagekey");
            return (Criteria) this;
        }

        public Criteria andPagetextIsNull() {
            addCriterion("PageText is null");
            return (Criteria) this;
        }

        public Criteria andPagetextIsNotNull() {
            addCriterion("PageText is not null");
            return (Criteria) this;
        }

        public Criteria andPagetextEqualTo(String value) {
            addCriterion("PageText =", value, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextNotEqualTo(String value) {
            addCriterion("PageText <>", value, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextGreaterThan(String value) {
            addCriterion("PageText >", value, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextGreaterThanOrEqualTo(String value) {
            addCriterion("PageText >=", value, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextLessThan(String value) {
            addCriterion("PageText <", value, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextLessThanOrEqualTo(String value) {
            addCriterion("PageText <=", value, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextLike(String value) {
            addCriterion("PageText like", value, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextNotLike(String value) {
            addCriterion("PageText not like", value, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextIn(List<String> values) {
            addCriterion("PageText in", values, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextNotIn(List<String> values) {
            addCriterion("PageText not in", values, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextBetween(String value1, String value2) {
            addCriterion("PageText between", value1, value2, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPagetextNotBetween(String value1, String value2) {
            addCriterion("PageText not between", value1, value2, "pagetext");
            return (Criteria) this;
        }

        public Criteria andPageurlIsNull() {
            addCriterion("PageURL is null");
            return (Criteria) this;
        }

        public Criteria andPageurlIsNotNull() {
            addCriterion("PageURL is not null");
            return (Criteria) this;
        }

        public Criteria andPageurlEqualTo(String value) {
            addCriterion("PageURL =", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotEqualTo(String value) {
            addCriterion("PageURL <>", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlGreaterThan(String value) {
            addCriterion("PageURL >", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlGreaterThanOrEqualTo(String value) {
            addCriterion("PageURL >=", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLessThan(String value) {
            addCriterion("PageURL <", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLessThanOrEqualTo(String value) {
            addCriterion("PageURL <=", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLike(String value) {
            addCriterion("PageURL like", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotLike(String value) {
            addCriterion("PageURL not like", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlIn(List<String> values) {
            addCriterion("PageURL in", values, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotIn(List<String> values) {
            addCriterion("PageURL not in", values, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlBetween(String value1, String value2) {
            addCriterion("PageURL between", value1, value2, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotBetween(String value1, String value2) {
            addCriterion("PageURL not between", value1, value2, "pageurl");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNull() {
            addCriterion("IsLeaf is null");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNotNull() {
            addCriterion("IsLeaf is not null");
            return (Criteria) this;
        }

        public Criteria andIsleafEqualTo(String value) {
            addCriterion("IsLeaf =", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotEqualTo(String value) {
            addCriterion("IsLeaf <>", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThan(String value) {
            addCriterion("IsLeaf >", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThanOrEqualTo(String value) {
            addCriterion("IsLeaf >=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThan(String value) {
            addCriterion("IsLeaf <", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThanOrEqualTo(String value) {
            addCriterion("IsLeaf <=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLike(String value) {
            addCriterion("IsLeaf like", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotLike(String value) {
            addCriterion("IsLeaf not like", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafIn(List<String> values) {
            addCriterion("IsLeaf in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotIn(List<String> values) {
            addCriterion("IsLeaf not in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafBetween(String value1, String value2) {
            addCriterion("IsLeaf between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotBetween(String value1, String value2) {
            addCriterion("IsLeaf not between", value1, value2, "isleaf");
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

        public Criteria andTargetframeIsNull() {
            addCriterion("TargetFrame is null");
            return (Criteria) this;
        }

        public Criteria andTargetframeIsNotNull() {
            addCriterion("TargetFrame is not null");
            return (Criteria) this;
        }

        public Criteria andTargetframeEqualTo(String value) {
            addCriterion("TargetFrame =", value, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeNotEqualTo(String value) {
            addCriterion("TargetFrame <>", value, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeGreaterThan(String value) {
            addCriterion("TargetFrame >", value, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeGreaterThanOrEqualTo(String value) {
            addCriterion("TargetFrame >=", value, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeLessThan(String value) {
            addCriterion("TargetFrame <", value, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeLessThanOrEqualTo(String value) {
            addCriterion("TargetFrame <=", value, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeLike(String value) {
            addCriterion("TargetFrame like", value, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeNotLike(String value) {
            addCriterion("TargetFrame not like", value, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeIn(List<String> values) {
            addCriterion("TargetFrame in", values, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeNotIn(List<String> values) {
            addCriterion("TargetFrame not in", values, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeBetween(String value1, String value2) {
            addCriterion("TargetFrame between", value1, value2, "targetframe");
            return (Criteria) this;
        }

        public Criteria andTargetframeNotBetween(String value1, String value2) {
            addCriterion("TargetFrame not between", value1, value2, "targetframe");
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