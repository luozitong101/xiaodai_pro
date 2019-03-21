package lzt.xiaodai.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class TInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInfoExample() {
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

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationIsNull() {
            addCriterion("socialrelation is null");
            return (Criteria) this;
        }

        public Criteria andSocialrelationIsNotNull() {
            addCriterion("socialrelation is not null");
            return (Criteria) this;
        }

        public Criteria andSocialrelationEqualTo(String value) {
            addCriterion("socialrelation =", value, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationNotEqualTo(String value) {
            addCriterion("socialrelation <>", value, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationGreaterThan(String value) {
            addCriterion("socialrelation >", value, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationGreaterThanOrEqualTo(String value) {
            addCriterion("socialrelation >=", value, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationLessThan(String value) {
            addCriterion("socialrelation <", value, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationLessThanOrEqualTo(String value) {
            addCriterion("socialrelation <=", value, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationLike(String value) {
            addCriterion("socialrelation like", value, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationNotLike(String value) {
            addCriterion("socialrelation not like", value, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationIn(List<String> values) {
            addCriterion("socialrelation in", values, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationNotIn(List<String> values) {
            addCriterion("socialrelation not in", values, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationBetween(String value1, String value2) {
            addCriterion("socialrelation between", value1, value2, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andSocialrelationNotBetween(String value1, String value2) {
            addCriterion("socialrelation not between", value1, value2, "socialrelation");
            return (Criteria) this;
        }

        public Criteria andRelationphoneIsNull() {
            addCriterion("relationphone is null");
            return (Criteria) this;
        }

        public Criteria andRelationphoneIsNotNull() {
            addCriterion("relationphone is not null");
            return (Criteria) this;
        }

        public Criteria andRelationphoneEqualTo(String value) {
            addCriterion("relationphone =", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneNotEqualTo(String value) {
            addCriterion("relationphone <>", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneGreaterThan(String value) {
            addCriterion("relationphone >", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneGreaterThanOrEqualTo(String value) {
            addCriterion("relationphone >=", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneLessThan(String value) {
            addCriterion("relationphone <", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneLessThanOrEqualTo(String value) {
            addCriterion("relationphone <=", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneLike(String value) {
            addCriterion("relationphone like", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneNotLike(String value) {
            addCriterion("relationphone not like", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneIn(List<String> values) {
            addCriterion("relationphone in", values, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneNotIn(List<String> values) {
            addCriterion("relationphone not in", values, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneBetween(String value1, String value2) {
            addCriterion("relationphone between", value1, value2, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneNotBetween(String value1, String value2) {
            addCriterion("relationphone not between", value1, value2, "relationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneIsNull() {
            addCriterion("socialrelationphone is null");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneIsNotNull() {
            addCriterion("socialrelationphone is not null");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneEqualTo(String value) {
            addCriterion("socialrelationphone =", value, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneNotEqualTo(String value) {
            addCriterion("socialrelationphone <>", value, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneGreaterThan(String value) {
            addCriterion("socialrelationphone >", value, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneGreaterThanOrEqualTo(String value) {
            addCriterion("socialrelationphone >=", value, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneLessThan(String value) {
            addCriterion("socialrelationphone <", value, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneLessThanOrEqualTo(String value) {
            addCriterion("socialrelationphone <=", value, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneLike(String value) {
            addCriterion("socialrelationphone like", value, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneNotLike(String value) {
            addCriterion("socialrelationphone not like", value, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneIn(List<String> values) {
            addCriterion("socialrelationphone in", values, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneNotIn(List<String> values) {
            addCriterion("socialrelationphone not in", values, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneBetween(String value1, String value2) {
            addCriterion("socialrelationphone between", value1, value2, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andSocialrelationphoneNotBetween(String value1, String value2) {
            addCriterion("socialrelationphone not between", value1, value2, "socialrelationphone");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(String value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(String value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(String value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(String value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(String value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLike(String value) {
            addCriterion("income like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotLike(String value) {
            addCriterion("income not like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<String> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<String> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(String value1, String value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(String value1, String value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("orgname is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("orgname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("orgname =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("orgname <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("orgname >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("orgname >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("orgname <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("orgname <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("orgname like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("orgname not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("orgname in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("orgname not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("orgname between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("orgname not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgaddressIsNull() {
            addCriterion("orgaddress is null");
            return (Criteria) this;
        }

        public Criteria andOrgaddressIsNotNull() {
            addCriterion("orgaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrgaddressEqualTo(String value) {
            addCriterion("orgaddress =", value, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressNotEqualTo(String value) {
            addCriterion("orgaddress <>", value, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressGreaterThan(String value) {
            addCriterion("orgaddress >", value, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressGreaterThanOrEqualTo(String value) {
            addCriterion("orgaddress >=", value, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressLessThan(String value) {
            addCriterion("orgaddress <", value, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressLessThanOrEqualTo(String value) {
            addCriterion("orgaddress <=", value, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressLike(String value) {
            addCriterion("orgaddress like", value, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressNotLike(String value) {
            addCriterion("orgaddress not like", value, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressIn(List<String> values) {
            addCriterion("orgaddress in", values, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressNotIn(List<String> values) {
            addCriterion("orgaddress not in", values, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressBetween(String value1, String value2) {
            addCriterion("orgaddress between", value1, value2, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgaddressNotBetween(String value1, String value2) {
            addCriterion("orgaddress not between", value1, value2, "orgaddress");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceIsNull() {
            addCriterion("orgprovince is null");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceIsNotNull() {
            addCriterion("orgprovince is not null");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceEqualTo(String value) {
            addCriterion("orgprovince =", value, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceNotEqualTo(String value) {
            addCriterion("orgprovince <>", value, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceGreaterThan(String value) {
            addCriterion("orgprovince >", value, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("orgprovince >=", value, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceLessThan(String value) {
            addCriterion("orgprovince <", value, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceLessThanOrEqualTo(String value) {
            addCriterion("orgprovince <=", value, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceLike(String value) {
            addCriterion("orgprovince like", value, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceNotLike(String value) {
            addCriterion("orgprovince not like", value, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceIn(List<String> values) {
            addCriterion("orgprovince in", values, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceNotIn(List<String> values) {
            addCriterion("orgprovince not in", values, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceBetween(String value1, String value2) {
            addCriterion("orgprovince between", value1, value2, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgprovinceNotBetween(String value1, String value2) {
            addCriterion("orgprovince not between", value1, value2, "orgprovince");
            return (Criteria) this;
        }

        public Criteria andOrgphoneIsNull() {
            addCriterion("orgphone is null");
            return (Criteria) this;
        }

        public Criteria andOrgphoneIsNotNull() {
            addCriterion("orgphone is not null");
            return (Criteria) this;
        }

        public Criteria andOrgphoneEqualTo(String value) {
            addCriterion("orgphone =", value, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneNotEqualTo(String value) {
            addCriterion("orgphone <>", value, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneGreaterThan(String value) {
            addCriterion("orgphone >", value, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneGreaterThanOrEqualTo(String value) {
            addCriterion("orgphone >=", value, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneLessThan(String value) {
            addCriterion("orgphone <", value, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneLessThanOrEqualTo(String value) {
            addCriterion("orgphone <=", value, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneLike(String value) {
            addCriterion("orgphone like", value, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneNotLike(String value) {
            addCriterion("orgphone not like", value, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneIn(List<String> values) {
            addCriterion("orgphone in", values, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneNotIn(List<String> values) {
            addCriterion("orgphone not in", values, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneBetween(String value1, String value2) {
            addCriterion("orgphone between", value1, value2, "orgphone");
            return (Criteria) this;
        }

        public Criteria andOrgphoneNotBetween(String value1, String value2) {
            addCriterion("orgphone not between", value1, value2, "orgphone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalstatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(Integer value) {
            addCriterion("maritalstatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(Integer value) {
            addCriterion("maritalstatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(Integer value) {
            addCriterion("maritalstatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("maritalstatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(Integer value) {
            addCriterion("maritalstatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(Integer value) {
            addCriterion("maritalstatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<Integer> values) {
            addCriterion("maritalstatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<Integer> values) {
            addCriterion("maritalstatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(Integer value1, Integer value2) {
            addCriterion("maritalstatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("maritalstatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("homeaddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("homeaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("homeaddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("homeaddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("homeaddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("homeaddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("homeaddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("homeaddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("homeaddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("homeaddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("homeaddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("homeaddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("homeaddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("homeaddress not between", value1, value2, "homeaddress");
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

        public Criteria andImageidIsNull() {
            addCriterion("imageid is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("imageid is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(Integer value) {
            addCriterion("imageid =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(Integer value) {
            addCriterion("imageid <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(Integer value) {
            addCriterion("imageid >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imageid >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(Integer value) {
            addCriterion("imageid <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(Integer value) {
            addCriterion("imageid <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<Integer> values) {
            addCriterion("imageid in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<Integer> values) {
            addCriterion("imageid not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(Integer value1, Integer value2) {
            addCriterion("imageid between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(Integer value1, Integer value2) {
            addCriterion("imageid not between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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