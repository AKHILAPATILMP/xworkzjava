package com.xworkz.isarelation.tattoo;
public class ColorTattoo extends Tattoo {

    public ColorTattoo() {
        super();
        System.out.println("ColorTattoo constructor is running - subclass");
    }

    @Override
    public void design() {
        System.out.println("ColorTattoo is designed with multiple vibrant colors - subclass");
    }

    @Override
    public void apply() {
        System.out.println("ColorTattoo is applied using advanced equipment - subclass");
    }

    @Override
    public void remove() {
        System.out.println("ColorTattoo removal requires laser technology - subclass");
    }

    @Override
    public void display() {
        System.out.println("ColorTattoo appears colorful and artistic - subclass");
    }
}


