package com.restaurant.bridge;

public class BurgerOrder extends MealOrder {
    public BurgerOrder(KitchenDevice device) {
        super(device);
    }

    @Override
    public void assembleMeal() {
        System.out.print("Burger Order: ");
        device.prepareFood();
    }
}
