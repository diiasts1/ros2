package com.restaurant.abstractfactory;

public interface RestaurantMealFactory {
    Drink createDrink();
    Dessert createDessert();
}
