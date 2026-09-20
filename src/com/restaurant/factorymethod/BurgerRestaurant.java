package com.restaurant.factorymethod;

public abstract class BurgerRestaurant {
    public abstract Burger createBurger();

    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        System.out.println("Burger is ready and packaged!\n");
    }
}