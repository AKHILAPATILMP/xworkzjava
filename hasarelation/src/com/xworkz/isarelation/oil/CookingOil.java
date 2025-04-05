package com.xworkz.isarelation.oil;

public class CookingOil extends Oil {

    public CookingOil() {
        super();
        System.out.println("CookingOil constructor is running - subclass");
    }

    @Override
    public void extract() {
        System.out.println("Extracting oil specifically for cooking - subclass");
    }

    @Override
    public void refine() {
        System.out.println("Refining cooking oil with extra filtration - subclass");
    }

    @Override
    public void store() {
        System.out.println("Storing cooking oil in food-grade containers - subclass");
    }

    @Override
    public void label() {
        System.out.println("Labeling cooking oil with nutritional facts - subclass");
    }
}
