package com.xworkz.isarelation.fabric;

public class CottonFabric extends Fabric {

    public CottonFabric() {
        super();
        System.out.println("CottonFabric constructor is running - subclass");
    }

    @Override
    public void weave() {
        System.out.println("Weaving cotton threads - subclass");
    }

    @Override
    public void dye() {
        System.out.println("Using natural dyes on cotton - subclass");
    }

    @Override
    public void print() {
        System.out.println("Printing floral patterns on cotton - subclass");
    }

    @Override
    public void fold() {
        System.out.println("Folding cotton fabric neatly - subclass");
    }

    @Override
    public void pack() {
        System.out.println("Packing cotton fabric in eco bags - subclass");
    }

    public void checkSoftness() {
        System.out.println("Checking softness of cotton fabric - subclass only");
    }
}
