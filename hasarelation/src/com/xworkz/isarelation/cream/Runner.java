package com.xworkz.isarelation.cream;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Cream");
        Cream cream = new Cream();
        cream.apply();
        cream.getIngredients();
        cream.checkExpiry();
        cream.remove();

        System.out.println("\nCreating an instance of FaceCream using Cream reference");
        Cream creamRef = new FaceCream();
        creamRef.apply();
        creamRef.getIngredients();
        creamRef.checkExpiry();
        creamRef.remove();

        System.out.println("\nCreating an instance of FaceCream using subclass reference");
        FaceCream faceCream = new FaceCream();
        faceCream.apply();
        faceCream.getIngredients();
        faceCream.checkExpiry();
        faceCream.remove();
    }
}
