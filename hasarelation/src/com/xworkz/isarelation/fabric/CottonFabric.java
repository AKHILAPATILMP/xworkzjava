package com.xworkz.isarelation.fabric;

public class CottonFabric extends Fabric {

    public CottonFabric() {
        super();
        System.out.println("CottonFabric constructor is running - subclass");
    }

    @Override
    public void weave() {
        System.out.println("Weaving cotton threads into soft fabric - subclass");
    }

    @Override
    public void dye() {
        System.out.println("Dyeing cotton fabric with eco-friendly colors - subclass");
    }

    @Override
    public void fold() {
        System.out.println("Folding cotton fabric carefully - subclass");
    }

    @Override
    public void pack() {
        System.out.println("Packing cotton fabric in breathable covers - subclass");
    }
}



