package com.xworkz.isarelation.beach;
public class ResortBeach extends Beach {

    public ResortBeach() {
        super();
        System.out.println("ResortBeach constructor is running - subclass");
    }

    @Override
    public void enjoySunset() {
        System.out.println("ResortBeach offers sunset view from private lounge - subclass");
    }

    @Override
    public void swim() {
        System.out.println("ResortBeach provides guided swimming areas - subclass");
    }

    @Override
    public void buildSandCastle() {
        System.out.println("ResortBeach organizes sandcastle competitions - subclass");
    }

    @Override
    public void collectShells() {
        System.out.println("ResortBeach has curated shell collection zones - subclass");
    }
}
