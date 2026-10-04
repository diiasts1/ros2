package com.restaurant;

import com.restaurant.factorymethod.*;
import com.restaurant.abstractfactory.*;
import com.restaurant.bridge.*;

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

        System.out.println("=== PART C: Bridge Pattern Test ===");
        KitchenDevice gasGrill = new GasGrill();
        KitchenDevice electricOven = new ElectricOven();

        MealOrder customBurger = new BurgerOrder(gasGrill);
        customBurger.assembleMeal();

        MealOrder customPizza = new PizzaOrder(electricOven);
        customPizza.assembleMeal();
    }

    public static void serveMeal(RestaurantMealFactory factory) {
        Drink drink = factory.createDrink();
        Dessert dessert = factory.createDessert();

        drink.consume();
        dessert.eat();
        System.out.println("--- Combo Meal Served ---\n");
    }
}

