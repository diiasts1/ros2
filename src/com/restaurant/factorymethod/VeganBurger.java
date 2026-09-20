package com.restaurant.factorymethod;

public class VeganBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a healthy plant-based VeganBurger with avocado.");
    }
}
