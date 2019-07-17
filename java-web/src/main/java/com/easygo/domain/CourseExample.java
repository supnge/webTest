package com.easygo.domain;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSchooltimeIsNull() {
            addCriterion("schooltime is null");
            return (Criteria) this;
        }

        public Criteria andSchooltimeIsNotNull() {
            addCriterion("schooltime is not null");
            return (Criteria) this;
        }

        public Criteria andSchooltimeEqualTo(Integer value) {
            addCriterion("schooltime =", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeNotEqualTo(Integer value) {
            addCriterion("schooltime <>", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeGreaterThan(Integer value) {
            addCriterion("schooltime >", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("schooltime >=", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeLessThan(Integer value) {
            addCriterion("schooltime <", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeLessThanOrEqualTo(Integer value) {
            addCriterion("schooltime <=", value, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeIn(List<Integer> values) {
            addCriterion("schooltime in", values, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeNotIn(List<Integer> values) {
            addCriterion("schooltime not in", values, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeBetween(Integer value1, Integer value2) {
            addCriterion("schooltime between", value1, value2, "schooltime");
            return (Criteria) this;
        }

        public Criteria andSchooltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("schooltime not between", value1, value2, "schooltime");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(Integer value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(Integer value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(Integer value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(Integer value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(Integer value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(Integer value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<Integer> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<Integer> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(Integer value1, Integer value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(Integer value1, Integer value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Short value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Short value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Short value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Short value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Short value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Short value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Short> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Short> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Short value1, Short value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Short value1, Short value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCourseinfoIsNull() {
            addCriterion("courseInfo is null");
            return (Criteria) this;
        }

        public Criteria andCourseinfoIsNotNull() {
            addCriterion("courseInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCourseinfoEqualTo(String value) {
            addCriterion("courseInfo =", value, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoNotEqualTo(String value) {
            addCriterion("courseInfo <>", value, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoGreaterThan(String value) {
            addCriterion("courseInfo >", value, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoGreaterThanOrEqualTo(String value) {
            addCriterion("courseInfo >=", value, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoLessThan(String value) {
            addCriterion("courseInfo <", value, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoLessThanOrEqualTo(String value) {
            addCriterion("courseInfo <=", value, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoLike(String value) {
            addCriterion("courseInfo like", value, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoNotLike(String value) {
            addCriterion("courseInfo not like", value, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoIn(List<String> values) {
            addCriterion("courseInfo in", values, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoNotIn(List<String> values) {
            addCriterion("courseInfo not in", values, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoBetween(String value1, String value2) {
            addCriterion("courseInfo between", value1, value2, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andCourseinfoNotBetween(String value1, String value2) {
            addCriterion("courseInfo not between", value1, value2, "courseinfo");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("teacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoIsNull() {
            addCriterion("teacherInfo is null");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoIsNotNull() {
            addCriterion("teacherInfo is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoEqualTo(String value) {
            addCriterion("teacherInfo =", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoNotEqualTo(String value) {
            addCriterion("teacherInfo <>", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoGreaterThan(String value) {
            addCriterion("teacherInfo >", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoGreaterThanOrEqualTo(String value) {
            addCriterion("teacherInfo >=", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoLessThan(String value) {
            addCriterion("teacherInfo <", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoLessThanOrEqualTo(String value) {
            addCriterion("teacherInfo <=", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoLike(String value) {
            addCriterion("teacherInfo like", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoNotLike(String value) {
            addCriterion("teacherInfo not like", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoIn(List<String> values) {
            addCriterion("teacherInfo in", values, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoNotIn(List<String> values) {
            addCriterion("teacherInfo not in", values, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoBetween(String value1, String value2) {
            addCriterion("teacherInfo between", value1, value2, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoNotBetween(String value1, String value2) {
            addCriterion("teacherInfo not between", value1, value2, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNull() {
            addCriterion("isFinish is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNotNull() {
            addCriterion("isFinish is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishEqualTo(Boolean value) {
            addCriterion("isFinish =", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotEqualTo(Boolean value) {
            addCriterion("isFinish <>", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThan(Boolean value) {
            addCriterion("isFinish >", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isFinish >=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThan(Boolean value) {
            addCriterion("isFinish <", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThanOrEqualTo(Boolean value) {
            addCriterion("isFinish <=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishIn(List<Boolean> values) {
            addCriterion("isFinish in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotIn(List<Boolean> values) {
            addCriterion("isFinish not in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishBetween(Boolean value1, Boolean value2) {
            addCriterion("isFinish between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isFinish not between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIsNull() {
            addCriterion("specialtyId is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIsNotNull() {
            addCriterion("specialtyId is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidEqualTo(Integer value) {
            addCriterion("specialtyId =", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotEqualTo(Integer value) {
            addCriterion("specialtyId <>", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidGreaterThan(Integer value) {
            addCriterion("specialtyId >", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialtyId >=", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidLessThan(Integer value) {
            addCriterion("specialtyId <", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidLessThanOrEqualTo(Integer value) {
            addCriterion("specialtyId <=", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIn(List<Integer> values) {
            addCriterion("specialtyId in", values, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotIn(List<Integer> values) {
            addCriterion("specialtyId not in", values, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidBetween(Integer value1, Integer value2) {
            addCriterion("specialtyId between", value1, value2, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotBetween(Integer value1, Integer value2) {
            addCriterion("specialtyId not between", value1, value2, "specialtyid");
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