package com.atguigu.crud.bean;

public class Restaurant {
    private String restaurantName;

    private String restaurantAddress;

    private String restaurantNotice;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName == null ? null : restaurantName.trim();
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress == null ? null : restaurantAddress.trim();
    }

    public String getRestaurantNotice() {
        return restaurantNotice;
    }

    public void setRestaurantNotice(String restaurantNotice) {
        this.restaurantNotice = restaurantNotice == null ? null : restaurantNotice.trim();
    }
}