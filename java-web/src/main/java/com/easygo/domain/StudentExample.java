package com.easygo.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("Sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("Sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("Sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("Sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("Sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("Sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("Sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("Sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("Sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("Sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("Sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("Sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("Sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("Sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("Sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("Sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("Sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("Sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("Sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("Sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("Sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("Sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("Sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("Sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("Sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("Sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("Sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("Sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSidcardIsNull() {
            addCriterion("Sidcard is null");
            return (Criteria) this;
        }

        public Criteria andSidcardIsNotNull() {
            addCriterion("Sidcard is not null");
            return (Criteria) this;
        }

        public Criteria andSidcardEqualTo(String value) {
            addCriterion("Sidcard =", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotEqualTo(String value) {
            addCriterion("Sidcard <>", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardGreaterThan(String value) {
            addCriterion("Sidcard >", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardGreaterThanOrEqualTo(String value) {
            addCriterion("Sidcard >=", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLessThan(String value) {
            addCriterion("Sidcard <", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLessThanOrEqualTo(String value) {
            addCriterion("Sidcard <=", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLike(String value) {
            addCriterion("Sidcard like", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotLike(String value) {
            addCriterion("Sidcard not like", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardIn(List<String> values) {
            addCriterion("Sidcard in", values, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotIn(List<String> values) {
            addCriterion("Sidcard not in", values, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardBetween(String value1, String value2) {
            addCriterion("Sidcard between", value1, value2, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotBetween(String value1, String value2) {
            addCriterion("Sidcard not between", value1, value2, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("Ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("Ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("Ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("Ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("Ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("Ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("Ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("Ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("Ssex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("Ssex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("Ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("Ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("Ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("Ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNull() {
            addCriterion("Spassword is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNotNull() {
            addCriterion("Spassword is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordEqualTo(String value) {
            addCriterion("Spassword =", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotEqualTo(String value) {
            addCriterion("Spassword <>", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThan(String value) {
            addCriterion("Spassword >", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Spassword >=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThan(String value) {
            addCriterion("Spassword <", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThanOrEqualTo(String value) {
            addCriterion("Spassword <=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLike(String value) {
            addCriterion("Spassword like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotLike(String value) {
            addCriterion("Spassword not like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordIn(List<String> values) {
            addCriterion("Spassword in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotIn(List<String> values) {
            addCriterion("Spassword not in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordBetween(String value1, String value2) {
            addCriterion("Spassword between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotBetween(String value1, String value2) {
            addCriterion("Spassword not between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSageIsNull() {
            addCriterion("Sage is null");
            return (Criteria) this;
        }

        public Criteria andSageIsNotNull() {
            addCriterion("Sage is not null");
            return (Criteria) this;
        }

        public Criteria andSageEqualTo(String value) {
            addCriterion("Sage =", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotEqualTo(String value) {
            addCriterion("Sage <>", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageGreaterThan(String value) {
            addCriterion("Sage >", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageGreaterThanOrEqualTo(String value) {
            addCriterion("Sage >=", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageLessThan(String value) {
            addCriterion("Sage <", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageLessThanOrEqualTo(String value) {
            addCriterion("Sage <=", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageLike(String value) {
            addCriterion("Sage like", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotLike(String value) {
            addCriterion("Sage not like", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageIn(List<String> values) {
            addCriterion("Sage in", values, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotIn(List<String> values) {
            addCriterion("Sage not in", values, "sage");
            return (Criteria) this;
        }

        public Criteria andSageBetween(String value1, String value2) {
            addCriterion("Sage between", value1, value2, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotBetween(String value1, String value2) {
            addCriterion("Sage not between", value1, value2, "sage");
            return (Criteria) this;
        }

        public Criteria andClassrIsNull() {
            addCriterion("Classr is null");
            return (Criteria) this;
        }

        public Criteria andClassrIsNotNull() {
            addCriterion("Classr is not null");
            return (Criteria) this;
        }

        public Criteria andClassrEqualTo(String value) {
            addCriterion("Classr =", value, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrNotEqualTo(String value) {
            addCriterion("Classr <>", value, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrGreaterThan(String value) {
            addCriterion("Classr >", value, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrGreaterThanOrEqualTo(String value) {
            addCriterion("Classr >=", value, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrLessThan(String value) {
            addCriterion("Classr <", value, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrLessThanOrEqualTo(String value) {
            addCriterion("Classr <=", value, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrLike(String value) {
            addCriterion("Classr like", value, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrNotLike(String value) {
            addCriterion("Classr not like", value, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrIn(List<String> values) {
            addCriterion("Classr in", values, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrNotIn(List<String> values) {
            addCriterion("Classr not in", values, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrBetween(String value1, String value2) {
            addCriterion("Classr between", value1, value2, "classr");
            return (Criteria) this;
        }

        public Criteria andClassrNotBetween(String value1, String value2) {
            addCriterion("Classr not between", value1, value2, "classr");
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

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIsNull() {
            addCriterion("specialtyid is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIsNotNull() {
            addCriterion("specialtyid is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidEqualTo(Integer value) {
            addCriterion("specialtyid =", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotEqualTo(Integer value) {
            addCriterion("specialtyid <>", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidGreaterThan(Integer value) {
            addCriterion("specialtyid >", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialtyid >=", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidLessThan(Integer value) {
            addCriterion("specialtyid <", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidLessThanOrEqualTo(Integer value) {
            addCriterion("specialtyid <=", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIn(List<Integer> values) {
            addCriterion("specialtyid in", values, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotIn(List<Integer> values) {
            addCriterion("specialtyid not in", values, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidBetween(Integer value1, Integer value2) {
            addCriterion("specialtyid between", value1, value2, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotBetween(Integer value1, Integer value2) {
            addCriterion("specialtyid not between", value1, value2, "specialtyid");
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