package com.xworkz.isarelation.dust;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Dust");
        Dust dust = new Dust();
        dust.spread();
        dust.settle();
        dust.clean();
        dust.examine();

        System.out.println("\nCreating an instance of DustCollector using Dust reference");
        Dust dustRef = new DustCollector();
        dustRef.spread();
        dustRef.settle();
        dustRef.clean();
        dustRef.examine();

        System.out.println("\nCreating an instance of DustCollector using subclass reference");
        DustCollector collector = new DustCollector();
        collector.spread();
        collector.settle();
        collector.clean();
        collector.examine();
    }
}


