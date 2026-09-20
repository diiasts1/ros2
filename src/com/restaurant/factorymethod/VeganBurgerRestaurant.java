package com.restaurant.factorymethod;

public class VeganBurgerRestaurant extends BurgerRestaurant {
    @Override
    public Burger createBurger() {
        return new VeganBurger();
    }
}
