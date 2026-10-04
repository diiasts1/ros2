package com.restaurant.bridge;

public class GasGrill implements KitchenDevice {
    @Override
    public void prepareFood() {
        System.out.println("Cooking using a high-heat gas grill.");
    }
}