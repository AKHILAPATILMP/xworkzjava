package com.xworkz.isarelation.fabric;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Fabric");
        Fabric base = new Fabric();
        base.weave();
        base.dye();
        base.print();
        base.fold();
        base.pack();

        System.out.println("\nCreating an instance of CottonFabric using Fabric reference");
        Fabric ref = new CottonFabric();
        ref.weave();
        ref.dye();
        ref.print();
        ref.fold();
        ref.pack();

        System.out.println("\nCreating an instance of CottonFabric using subclass reference");
        CottonFabric cotton = new CottonFabric();
        cotton.weave();
        cotton.dye();
        cotton.print();
        cotton.fold();
        cotton.pack();
        cotton.checkSoftness();

        System.out.println("\nUsing FabricShop with casting check");
        FabricShop shop = new FabricShop();
        shop.process(base);
        shop.process(ref);
        shop.process(cotton);
    }
}
