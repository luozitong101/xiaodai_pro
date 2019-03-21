package lzt.xiaodai.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class TImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TImageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFrontUrlIsNull() {
            addCriterion("front_url is null");
            return (Criteria) this;
        }

        public Criteria andFrontUrlIsNotNull() {
            addCriterion("front_url is not null");
            return (Criteria) this;
        }

        public Criteria andFrontUrlEqualTo(String value) {
            addCriterion("front_url =", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlNotEqualTo(String value) {
            addCriterion("front_url <>", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlGreaterThan(String value) {
            addCriterion("front_url >", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlGreaterThanOrEqualTo(String value) {
            addCriterion("front_url >=", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlLessThan(String value) {
            addCriterion("front_url <", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlLessThanOrEqualTo(String value) {
            addCriterion("front_url <=", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlLike(String value) {
            addCriterion("front_url like", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlNotLike(String value) {
            addCriterion("front_url not like", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlIn(List<String> values) {
            addCriterion("front_url in", values, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlNotIn(List<String> values) {
            addCriterion("front_url not in", values, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlBetween(String value1, String value2) {
            addCriterion("front_url between", value1, value2, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlNotBetween(String value1, String value2) {
            addCriterion("front_url not between", value1, value2, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlIsNull() {
            addCriterion("back_url is null");
            return (Criteria) this;
        }

        public Criteria andBackUrlIsNotNull() {
            addCriterion("back_url is not null");
            return (Criteria) this;
        }

        public Criteria andBackUrlEqualTo(String value) {
            addCriterion("back_url =", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlNotEqualTo(String value) {
            addCriterion("back_url <>", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlGreaterThan(String value) {
            addCriterion("back_url >", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("back_url >=", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlLessThan(String value) {
            addCriterion("back_url <", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlLessThanOrEqualTo(String value) {
            addCriterion("back_url <=", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlLike(String value) {
            addCriterion("back_url like", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlNotLike(String value) {
            addCriterion("back_url not like", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlIn(List<String> values) {
            addCriterion("back_url in", values, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlNotIn(List<String> values) {
            addCriterion("back_url not in", values, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlBetween(String value1, String value2) {
            addCriterion("back_url between", value1, value2, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlNotBetween(String value1, String value2) {
            addCriterion("back_url not between", value1, value2, "backUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlIsNull() {
            addCriterion("family_url_ is null");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlIsNotNull() {
            addCriterion("family_url_ is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlEqualTo(String value) {
            addCriterion("family_url_ =", value, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlNotEqualTo(String value) {
            addCriterion("family_url_ <>", value, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlGreaterThan(String value) {
            addCriterion("family_url_ >", value, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("family_url_ >=", value, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlLessThan(String value) {
            addCriterion("family_url_ <", value, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlLessThanOrEqualTo(String value) {
            addCriterion("family_url_ <=", value, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlLike(String value) {
            addCriterion("family_url_ like", value, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlNotLike(String value) {
            addCriterion("family_url_ not like", value, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlIn(List<String> values) {
            addCriterion("family_url_ in", values, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlNotIn(List<String> values) {
            addCriterion("family_url_ not in", values, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlBetween(String value1, String value2) {
            addCriterion("family_url_ between", value1, value2, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andFamilyUrlNotBetween(String value1, String value2) {
            addCriterion("family_url_ not between", value1, value2, "familyUrl");
            return (Criteria) this;
        }

        public Criteria andExtends1IsNull() {
            addCriterion("extends_1 is null");
            return (Criteria) this;
        }

        public Criteria andExtends1IsNotNull() {
            addCriterion("extends_1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtends1EqualTo(String value) {
            addCriterion("extends_1 =", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1NotEqualTo(String value) {
            addCriterion("extends_1 <>", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1GreaterThan(String value) {
            addCriterion("extends_1 >", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1GreaterThanOrEqualTo(String value) {
            addCriterion("extends_1 >=", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1LessThan(String value) {
            addCriterion("extends_1 <", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1LessThanOrEqualTo(String value) {
            addCriterion("extends_1 <=", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1Like(String value) {
            addCriterion("extends_1 like", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1NotLike(String value) {
            addCriterion("extends_1 not like", value, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1In(List<String> values) {
            addCriterion("extends_1 in", values, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1NotIn(List<String> values) {
            addCriterion("extends_1 not in", values, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1Between(String value1, String value2) {
            addCriterion("extends_1 between", value1, value2, "extends1");
            return (Criteria) this;
        }

        public Criteria andExtends1NotBetween(String value1, String value2) {
            addCriterion("extends_1 not between", value1, value2, "extends1");
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