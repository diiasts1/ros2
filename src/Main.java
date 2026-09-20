package com.restaurant;

import com.restaurant.factorymethod.*;
import com.restaurant.abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PART A: Factory Method Test ===");
        BurgerRestaurant cheeseRestaurant = new CheeseBurgerRestaurant();
        cheeseRestaurant.orderBurger();

        BurgerRestaurant veganRestaurant = new VeganBurgerRestaurant();
        veganRestaurant.orderBurger();

        System.out.println("=== PART B: Abstract Factory Test ===");
        RestaurantMealFactory fastFoodFactory = new FastFoodMealFactory();
        serveMeal(fastFoodFactory);

        RestaurantMealFactory premiumFactory = new PremiumMealFactory();
        serveMeal(premiumFactory);
    }

    public static void serveMeal(RestaurantMealFactory factory) {
        Drink drink = factory.createDrink();
        Dessert dessert = factory.createDessert();

        drink.consume();
        dessert.eat();
        System.out.println("--- Combo Meal Served ---\n");
    }
}