package com.example.entity;


/**
 * @author PG
 */
public class FoodClient {
    private String foodName;
    private byte[] picPath;
    /**
     * 营养价值
     */
    private String healthWorth;

    /**
     * 食材简介
     */
    private String introduction;

    /**
     * 食用功效
     */
    private String benefit;

    /**
     * 适用人群
     */
    private String suitablePeople;

    /**
     * 禁忌人群
     */
    private String tabooPeople;

    /**
     * 营养成分
     */
    private String nutritionalIngredient;

    public FoodClient() {
    }

    public FoodClient(String foodName, byte[] picPath, String healthWorth, String introduction, String benefit, String suitablePeople, String tabooPeople, String nutritionalIngredient) {
        this.foodName = foodName;
        this.picPath = picPath;
        this.healthWorth = healthWorth;
        this.introduction = introduction;
        this.benefit = benefit;
        this.suitablePeople = suitablePeople;
        this.tabooPeople = tabooPeople;
        this.nutritionalIngredient = nutritionalIngredient;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public byte[] getPicPath() {
        return picPath;
    }

    public void setPicPath(byte[] picPath) {
        this.picPath = picPath;
    }

    public String getHealthWorth() {
        return healthWorth;
    }

    public void setHealthWorth(String healthWorth) {
        this.healthWorth = healthWorth;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getSuitablePeople() {
        return suitablePeople;
    }

    public void setSuitablePeople(String suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    public String getTabooPeople() {
        return tabooPeople;
    }

    public void setTabooPeople(String tabooPeople) {
        this.tabooPeople = tabooPeople;
    }

    public String getNutritionalIngredient() {
        return nutritionalIngredient;
    }

    public void setNutritionalIngredient(String nutritionalIngredient) {
        this.nutritionalIngredient = nutritionalIngredient;
    }
}
