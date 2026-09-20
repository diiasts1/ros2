package com.restaurant.factorymethod;

public class CheeseBurgerRestaurant extends BurgerRestaurant {
    @Override
    public Burger createBurger() {
        return new CheeseBurger();
    }
}
