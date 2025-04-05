package com.xworkz.isarelation.tattoo;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Tattoo");
        Tattoo tattoo = new Tattoo();
        tattoo.design();
        tattoo.apply();
        tattoo.remove();
        tattoo.display();

        System.out.println("\nCreating an instance of ColorTattoo using Tattoo reference");
        Tattoo tattooRef = new ColorTattoo();
        tattooRef.design();
        tattooRef.apply();
        tattooRef.remove();
        tattooRef.display();

        System.out.println("\nCreating an instance of ColorTattoo using subclass reference");
        ColorTattoo colorTattoo = new ColorTattoo();
        colorTattoo.design();
        colorTattoo.apply();
        colorTattoo.remove();
        colorTattoo.display();
    }
}


