package com.restaurant.bridge;

public class ElectricOven implements KitchenDevice {
    @Override
    public void prepareFood() {
        System.out.println("Cooking using a precise electric oven.");
    }
}
