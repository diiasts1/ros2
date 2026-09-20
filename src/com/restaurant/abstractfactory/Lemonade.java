package com.restaurant.abstractfactory;

public class Lemonade implements Drink {
    @Override
    public void consume() {
        System.out.println("Drinking artisanal mint Lemonade.");
    }
}
