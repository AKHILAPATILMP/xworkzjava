package com.xworkz.isarelation.umbrella;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Umbrella");
        Umbrella umbrella = new Umbrella();
        umbrella.open();
        umbrella.close();
        umbrella.provideShade();
        umbrella.carry();

        System.out.println("\nCreating an instance of FoldingUmbrella using Umbrella reference");
        Umbrella ref = new FoldingUmbrella();
        ref.open();
        ref.close();
        ref.provideShade();
        ref.carry();

        System.out.println("\nCreating an instance of FoldingUmbrella using subclass reference");
        FoldingUmbrella foldUmbrella = new FoldingUmbrella();
        foldUmbrella.open();
        foldUmbrella.close();
        foldUmbrella.provideShade();
        foldUmbrella.carry();
    }
}
