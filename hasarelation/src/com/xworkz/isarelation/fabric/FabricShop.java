package com.xworkz.isarelation.fabric;

public class FabricShop {

    public void process(Fabric fabric) {
        fabric.weave();
        fabric.dye();
        fabric.print();
        fabric.fold();
        fabric.pack();

        if (fabric instanceof CottonFabric) {
            System.out.println("Casting: Fabric is instance of CottonFabric");
            CottonFabric cotton = (CottonFabric) fabric;
            cotton.checkSoftness();
        }
    }
}
