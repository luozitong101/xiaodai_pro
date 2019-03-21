package lzt.xiaodai.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class TAuthBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAuthBankExample() {
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

        public Criteria andAccountprovinceIsNull() {
            addCriterion("accountprovince is null");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceIsNotNull() {
            addCriterion("accountprovince is not null");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceEqualTo(String value) {
            addCriterion("accountprovince =", value, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceNotEqualTo(String value) {
            addCriterion("accountprovince <>", value, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceGreaterThan(String value) {
            addCriterion("accountprovince >", value, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("accountprovince >=", value, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceLessThan(String value) {
            addCriterion("accountprovince <", value, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceLessThanOrEqualTo(String value) {
            addCriterion("accountprovince <=", value, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceLike(String value) {
            addCriterion("accountprovince like", value, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceNotLike(String value) {
            addCriterion("accountprovince not like", value, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceIn(List<String> values) {
            addCriterion("accountprovince in", values, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceNotIn(List<String> values) {
            addCriterion("accountprovince not in", values, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceBetween(String value1, String value2) {
            addCriterion("accountprovince between", value1, value2, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountprovinceNotBetween(String value1, String value2) {
            addCriterion("accountprovince not between", value1, value2, "accountprovince");
            return (Criteria) this;
        }

        public Criteria andAccountphoneIsNull() {
            addCriterion("accountphone is null");
            return (Criteria) this;
        }

        public Criteria andAccountphoneIsNotNull() {
            addCriterion("accountphone is not null");
            return (Criteria) this;
        }

        public Criteria andAccountphoneEqualTo(String value) {
            addCriterion("accountphone =", value, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneNotEqualTo(String value) {
            addCriterion("accountphone <>", value, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneGreaterThan(String value) {
            addCriterion("accountphone >", value, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneGreaterThanOrEqualTo(String value) {
            addCriterion("accountphone >=", value, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneLessThan(String value) {
            addCriterion("accountphone <", value, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneLessThanOrEqualTo(String value) {
            addCriterion("accountphone <=", value, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneLike(String value) {
            addCriterion("accountphone like", value, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneNotLike(String value) {
            addCriterion("accountphone not like", value, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneIn(List<String> values) {
            addCriterion("accountphone in", values, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneNotIn(List<String> values) {
            addCriterion("accountphone not in", values, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneBetween(String value1, String value2) {
            addCriterion("accountphone between", value1, value2, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountphoneNotBetween(String value1, String value2) {
            addCriterion("accountphone not between", value1, value2, "accountphone");
            return (Criteria) this;
        }

        public Criteria andAccountbankIsNull() {
            addCriterion("accountbank is null");
            return (Criteria) this;
        }

        public Criteria andAccountbankIsNotNull() {
            addCriterion("accountbank is not null");
            return (Criteria) this;
        }

        public Criteria andAccountbankEqualTo(String value) {
            addCriterion("accountbank =", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankNotEqualTo(String value) {
            addCriterion("accountbank <>", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankGreaterThan(String value) {
            addCriterion("accountbank >", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankGreaterThanOrEqualTo(String value) {
            addCriterion("accountbank >=", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankLessThan(String value) {
            addCriterion("accountbank <", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankLessThanOrEqualTo(String value) {
            addCriterion("accountbank <=", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankLike(String value) {
            addCriterion("accountbank like", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankNotLike(String value) {
            addCriterion("accountbank not like", value, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankIn(List<String> values) {
            addCriterion("accountbank in", values, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankNotIn(List<String> values) {
            addCriterion("accountbank not in", values, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankBetween(String value1, String value2) {
            addCriterion("accountbank between", value1, value2, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountbankNotBetween(String value1, String value2) {
            addCriterion("accountbank not between", value1, value2, "accountbank");
            return (Criteria) this;
        }

        public Criteria andAccountcardIsNull() {
            addCriterion("accountcard is null");
            return (Criteria) this;
        }

        public Criteria andAccountcardIsNotNull() {
            addCriterion("accountcard is not null");
            return (Criteria) this;
        }

        public Criteria andAccountcardEqualTo(String value) {
            addCriterion("accountcard =", value, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardNotEqualTo(String value) {
            addCriterion("accountcard <>", value, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardGreaterThan(String value) {
            addCriterion("accountcard >", value, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardGreaterThanOrEqualTo(String value) {
            addCriterion("accountcard >=", value, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardLessThan(String value) {
            addCriterion("accountcard <", value, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardLessThanOrEqualTo(String value) {
            addCriterion("accountcard <=", value, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardLike(String value) {
            addCriterion("accountcard like", value, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardNotLike(String value) {
            addCriterion("accountcard not like", value, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardIn(List<String> values) {
            addCriterion("accountcard in", values, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardNotIn(List<String> values) {
            addCriterion("accountcard not in", values, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardBetween(String value1, String value2) {
            addCriterion("accountcard between", value1, value2, "accountcard");
            return (Criteria) this;
        }

        public Criteria andAccountcardNotBetween(String value1, String value2) {
            addCriterion("accountcard not between", value1, value2, "accountcard");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andExtends2IsNull() {
            addCriterion("extends_2 is null");
            return (Criteria) this;
        }

        public Criteria andExtends2IsNotNull() {
            addCriterion("extends_2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtends2EqualTo(String value) {
            addCriterion("extends_2 =", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2NotEqualTo(String value) {
            addCriterion("extends_2 <>", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2GreaterThan(String value) {
            addCriterion("extends_2 >", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2GreaterThanOrEqualTo(String value) {
            addCriterion("extends_2 >=", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2LessThan(String value) {
            addCriterion("extends_2 <", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2LessThanOrEqualTo(String value) {
            addCriterion("extends_2 <=", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2Like(String value) {
            addCriterion("extends_2 like", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2NotLike(String value) {
            addCriterion("extends_2 not like", value, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2In(List<String> values) {
            addCriterion("extends_2 in", values, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2NotIn(List<String> values) {
            addCriterion("extends_2 not in", values, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2Between(String value1, String value2) {
            addCriterion("extends_2 between", value1, value2, "extends2");
            return (Criteria) this;
        }

        public Criteria andExtends2NotBetween(String value1, String value2) {
            addCriterion("extends_2 not between", value1, value2, "extends2");
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