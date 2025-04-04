package com.xworkz.isarelation.fabric;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Fabric");
        Fabric fabric = new Fabric();
        fabric.weave();
        fabric.dye();
        fabric.fold();
        fabric.pack();

        System.out.println("\nCreating an instance of CottonFabric using Fabric reference");
        Fabric fabricRef = new CottonFabric();
        fabricRef.weave();
        fabricRef.dye();
        fabricRef.fold();
        fabricRef.pack();

        System.out.println("\nCreating an instance of CottonFabric using subclass reference");
        CottonFabric cotton = new CottonFabric();
        cotton.weave();
        cotton.dye();
        cotton.fold();
        cotton.pack();
    }
}
