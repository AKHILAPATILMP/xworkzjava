package com.xworkz.isarelation.sofa;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Sofa");
        Sofa sofa = new Sofa();
        sofa.sit();
        sofa.recline();
        sofa.clean();
        sofa.showStyle();

        System.out.println("\nCreating an instance of LuxurySofa using Sofa reference");
        Sofa ref = new LuxurySofa();
        ref.sit();
        ref.recline();
        ref.clean();
        ref.showStyle();

        System.out.println("\nCreating an instance of LuxurySofa using subclass reference");
        LuxurySofa luxurySofa = new LuxurySofa();
        luxurySofa.sit();
        luxurySofa.recline();
        luxurySofa.clean();
        luxurySofa.showStyle();
    }
}

