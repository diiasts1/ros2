package com.restaurant.bridge;

public class PizzaOrder extends MealOrder {
    public PizzaOrder(KitchenDevice device) {
        super(device);
    }

    @Override
    public void assembleMeal() {
        System.out.print("Pizza Order: ");
        device.prepareFood();
    }
}