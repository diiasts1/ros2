package com.restaurant.abstractfactory;

public class FastFoodMealFactory implements RestaurantMealFactory {
    @Override
    public Drink createDrink() {
        return new Cola();
    }

    @Override
    public Dessert createDessert() {
        return new Brownie();
    }
}
