package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class MealsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MealsExample() {
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

        public Criteria andMealsIdIsNull() {
            addCriterion("meals_id is null");
            return (Criteria) this;
        }

        public Criteria andMealsIdIsNotNull() {
            addCriterion("meals_id is not null");
            return (Criteria) this;
        }

        public Criteria andMealsIdEqualTo(Integer value) {
            addCriterion("meals_id =", value, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdNotEqualTo(Integer value) {
            addCriterion("meals_id <>", value, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdGreaterThan(Integer value) {
            addCriterion("meals_id >", value, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meals_id >=", value, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdLessThan(Integer value) {
            addCriterion("meals_id <", value, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdLessThanOrEqualTo(Integer value) {
            addCriterion("meals_id <=", value, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdIn(List<Integer> values) {
            addCriterion("meals_id in", values, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdNotIn(List<Integer> values) {
            addCriterion("meals_id not in", values, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdBetween(Integer value1, Integer value2) {
            addCriterion("meals_id between", value1, value2, "mealsId");
            return (Criteria) this;
        }

        public Criteria andMealsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meals_id not between", value1, value2, "mealsId");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("sort_id =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("sort_id <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("sort_id >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_id >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("sort_id <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_id <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("sort_id in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("sort_id not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_id between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_id not between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andMealsNameIsNull() {
            addCriterion("meals_name is null");
            return (Criteria) this;
        }

        public Criteria andMealsNameIsNotNull() {
            addCriterion("meals_name is not null");
            return (Criteria) this;
        }

        public Criteria andMealsNameEqualTo(String value) {
            addCriterion("meals_name =", value, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameNotEqualTo(String value) {
            addCriterion("meals_name <>", value, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameGreaterThan(String value) {
            addCriterion("meals_name >", value, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameGreaterThanOrEqualTo(String value) {
            addCriterion("meals_name >=", value, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameLessThan(String value) {
            addCriterion("meals_name <", value, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameLessThanOrEqualTo(String value) {
            addCriterion("meals_name <=", value, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameLike(String value) {
            addCriterion("meals_name like", value, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameNotLike(String value) {
            addCriterion("meals_name not like", value, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameIn(List<String> values) {
            addCriterion("meals_name in", values, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameNotIn(List<String> values) {
            addCriterion("meals_name not in", values, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameBetween(String value1, String value2) {
            addCriterion("meals_name between", value1, value2, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsNameNotBetween(String value1, String value2) {
            addCriterion("meals_name not between", value1, value2, "mealsName");
            return (Criteria) this;
        }

        public Criteria andMealsPriceIsNull() {
            addCriterion("meals_price is null");
            return (Criteria) this;
        }

        public Criteria andMealsPriceIsNotNull() {
            addCriterion("meals_price is not null");
            return (Criteria) this;
        }

        public Criteria andMealsPriceEqualTo(Float value) {
            addCriterion("meals_price =", value, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceNotEqualTo(Float value) {
            addCriterion("meals_price <>", value, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceGreaterThan(Float value) {
            addCriterion("meals_price >", value, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("meals_price >=", value, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceLessThan(Float value) {
            addCriterion("meals_price <", value, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceLessThanOrEqualTo(Float value) {
            addCriterion("meals_price <=", value, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceIn(List<Float> values) {
            addCriterion("meals_price in", values, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceNotIn(List<Float> values) {
            addCriterion("meals_price not in", values, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceBetween(Float value1, Float value2) {
            addCriterion("meals_price between", value1, value2, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsPriceNotBetween(Float value1, Float value2) {
            addCriterion("meals_price not between", value1, value2, "mealsPrice");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentIsNull() {
            addCriterion("meals_represent is null");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentIsNotNull() {
            addCriterion("meals_represent is not null");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentEqualTo(String value) {
            addCriterion("meals_represent =", value, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentNotEqualTo(String value) {
            addCriterion("meals_represent <>", value, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentGreaterThan(String value) {
            addCriterion("meals_represent >", value, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentGreaterThanOrEqualTo(String value) {
            addCriterion("meals_represent >=", value, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentLessThan(String value) {
            addCriterion("meals_represent <", value, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentLessThanOrEqualTo(String value) {
            addCriterion("meals_represent <=", value, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentLike(String value) {
            addCriterion("meals_represent like", value, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentNotLike(String value) {
            addCriterion("meals_represent not like", value, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentIn(List<String> values) {
            addCriterion("meals_represent in", values, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentNotIn(List<String> values) {
            addCriterion("meals_represent not in", values, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentBetween(String value1, String value2) {
            addCriterion("meals_represent between", value1, value2, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsRepresentNotBetween(String value1, String value2) {
            addCriterion("meals_represent not between", value1, value2, "mealsRepresent");
            return (Criteria) this;
        }

        public Criteria andMealsPictureIsNull() {
            addCriterion("meals_picture is null");
            return (Criteria) this;
        }

        public Criteria andMealsPictureIsNotNull() {
            addCriterion("meals_picture is not null");
            return (Criteria) this;
        }

        public Criteria andMealsPictureEqualTo(String value) {
            addCriterion("meals_picture =", value, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureNotEqualTo(String value) {
            addCriterion("meals_picture <>", value, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureGreaterThan(String value) {
            addCriterion("meals_picture >", value, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureGreaterThanOrEqualTo(String value) {
            addCriterion("meals_picture >=", value, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureLessThan(String value) {
            addCriterion("meals_picture <", value, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureLessThanOrEqualTo(String value) {
            addCriterion("meals_picture <=", value, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureLike(String value) {
            addCriterion("meals_picture like", value, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureNotLike(String value) {
            addCriterion("meals_picture not like", value, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureIn(List<String> values) {
            addCriterion("meals_picture in", values, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureNotIn(List<String> values) {
            addCriterion("meals_picture not in", values, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureBetween(String value1, String value2) {
            addCriterion("meals_picture between", value1, value2, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsPictureNotBetween(String value1, String value2) {
            addCriterion("meals_picture not between", value1, value2, "mealsPicture");
            return (Criteria) this;
        }

        public Criteria andMealsSalesIsNull() {
            addCriterion("meals_sales is null");
            return (Criteria) this;
        }

        public Criteria andMealsSalesIsNotNull() {
            addCriterion("meals_sales is not null");
            return (Criteria) this;
        }

        public Criteria andMealsSalesEqualTo(Integer value) {
            addCriterion("meals_sales =", value, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesNotEqualTo(Integer value) {
            addCriterion("meals_sales <>", value, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesGreaterThan(Integer value) {
            addCriterion("meals_sales >", value, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("meals_sales >=", value, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesLessThan(Integer value) {
            addCriterion("meals_sales <", value, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesLessThanOrEqualTo(Integer value) {
            addCriterion("meals_sales <=", value, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesIn(List<Integer> values) {
            addCriterion("meals_sales in", values, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesNotIn(List<Integer> values) {
            addCriterion("meals_sales not in", values, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesBetween(Integer value1, Integer value2) {
            addCriterion("meals_sales between", value1, value2, "mealsSales");
            return (Criteria) this;
        }

        public Criteria andMealsSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("meals_sales not between", value1, value2, "mealsSales");
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