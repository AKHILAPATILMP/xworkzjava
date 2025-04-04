package com.xworkz.isarelation.flute;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Flute");
        Flute flute = new Flute();
        flute.play();
        flute.clean();
        flute.tune();
        flute.store();

        System.out.println("\nCreating an instance of BambooFlute using Flute reference");
        Flute fluteRef = new BambooFlute();
        fluteRef.play();
        fluteRef.clean();
        fluteRef.tune();
        fluteRef.store();

        System.out.println("\nCreating an instance of BambooFlute using subclass reference");
        BambooFlute bambooFlute = new BambooFlute();
        bambooFlute.play();
        bambooFlute.clean();
        bambooFlute.tune();
        bambooFlute.store();
    }
}
