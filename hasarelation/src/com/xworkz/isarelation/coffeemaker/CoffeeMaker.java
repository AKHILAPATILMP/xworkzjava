package com.xworkz.isarelation.coffeemaker;

public class CoffeeMaker {

    public CoffeeMaker() {
        System.out.println("CoffeeMaker constructor is running - parent class");
    }

    public void addWater() {
        System.out.println("Adding water - parent class");
    }

    public void addCoffeePowder() {
        System.out.println("Adding regular coffee powder - parent class");
    }

    public void brewCoffee() {
        System.out.println("Brewing coffee manually - parent class");
    }

    public void pourCoffee() {
        System.out.println("Pouring coffee into the cup - parent class");
    }
}

