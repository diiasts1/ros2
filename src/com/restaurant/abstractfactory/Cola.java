package com.restaurant.abstractfactory;

public class Cola implements Drink {
    @Override
    public void consume() {
        System.out.println("Drinking refreshing iced Cola.");
    }
}
