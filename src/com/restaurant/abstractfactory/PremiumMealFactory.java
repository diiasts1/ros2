package com.restaurant.abstractfactory;

public class PremiumMealFactory implements RestaurantMealFactory {
    @Override
    public Drink createDrink() {
        return new Lemonade();
    }

    @Override
    public Dessert createDessert() {
        return new Cheesecake();
    }
}