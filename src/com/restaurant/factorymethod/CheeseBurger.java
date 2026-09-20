package com.restaurant.factorymethod;

public class CheeseBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a juicy beef CheeseBurger with extra cheddar.");
    }
}
