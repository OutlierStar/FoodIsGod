package com.atguigu.crud.bean;

public class ShoppingCartKey {
    private Integer userId;

    private Integer mealsId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMealsId() {
        return mealsId;
    }

    public void setMealsId(Integer mealsId) {
        this.mealsId = mealsId;
    }
}