package com.restaurant.bridge;

public abstract class MealOrder {
    protected KitchenDevice device;

    protected MealOrder(KitchenDevice device) {
        this.device = device;
    }
    public abstract void assembleMeal();
}