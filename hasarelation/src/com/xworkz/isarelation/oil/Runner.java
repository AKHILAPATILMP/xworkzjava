package com.xworkz.isarelation.oil;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Oil");
        Oil oil = new Oil();
        oil.extract();
        oil.refine();
        oil.store();
        oil.label();

        System.out.println("\nCreating an instance of CookingOil using Oil reference");
        Oil oilRef = new CookingOil();
        oilRef.extract();
        oilRef.refine();
        oilRef.store();
        oilRef.label();

        System.out.println("\nCreating an instance of CookingOil using subclass reference");
        CookingOil cookingOil = new CookingOil();
        cookingOil.extract();
        cookingOil.refine();
        cookingOil.store();
        cookingOil.label();
    }
}
