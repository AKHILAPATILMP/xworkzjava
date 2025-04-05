package com.xworkz.isarelation.sofa;
public class LuxurySofa extends Sofa {

    public LuxurySofa() {
        super();
        System.out.println("LuxurySofa constructor is running - subclass");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a luxury sofa with cushions - subclass");
    }

    @Override
    public void recline() {
        System.out.println("LuxurySofa has an electric recline feature - subclass");
    }

    @Override
    public void clean() {
        System.out.println("LuxurySofa is cleaned with special fabric cleaner - subclass");
    }

    @Override
    public void showStyle() {
        System.out.println("LuxurySofa has a premium design - subclass");
    }
}


