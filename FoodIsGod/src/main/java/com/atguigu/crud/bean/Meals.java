package com.atguigu.crud.bean;

public class Meals {
    private Integer mealsId;

    private Integer sortId;

    private String mealsName;

    private Float mealsPrice;

    private String mealsRepresent;

    private String mealsPicture;

    private Integer mealsSales;

    public Integer getMealsId() {
        return mealsId;
    }

    public void setMealsId(Integer mealsId) {
        this.mealsId = mealsId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getMealsName() {
        return mealsName;
    }

    public void setMealsName(String mealsName) {
        this.mealsName = mealsName == null ? null : mealsName.trim();
    }

    public Float getMealsPrice() {
        return mealsPrice;
    }

    public void setMealsPrice(Float mealsPrice) {
        this.mealsPrice = mealsPrice;
    }

    public String getMealsRepresent() {
        return mealsRepresent;
    }

    public void setMealsRepresent(String mealsRepresent) {
        this.mealsRepresent = mealsRepresent == null ? null : mealsRepresent.trim();
    }

    public String getMealsPicture() {
        return mealsPicture;
    }

    public void setMealsPicture(String mealsPicture) {
        this.mealsPicture = mealsPicture == null ? null : mealsPicture.trim();
    }

    public Integer getMealsSales() {
        return mealsSales;
    }

    public void setMealsSales(Integer mealsSales) {
        this.mealsSales = mealsSales;
    }
}