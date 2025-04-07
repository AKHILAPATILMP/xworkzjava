package com.xworkz.isarelation.beach;

public class ResortBeach extends Beach {

    public ResortBeach() {
        super();
        System.out.println("ResortBeach constructor is running - subclass");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing with lounge chairs and umbrellas - subclass");
    }

    @Override
    public void swim() {
        System.out.println("Swimming in a designated resort zone - subclass");
    }

    @Override
    public void walk() {
        System.out.println("Walking along private beachfront - subclass");
    }

    @Override
    public void cleanBeach() {
        System.out.println("Resort staff cleaning the beach - subclass");
    }

    @Override
    public void playVolleyball() {
        System.out.println("Playing beach volleyball on a professional court - subclass");
    }

    public void enjoyResortFacilities() {
        System.out.println("Enjoying resort beach facilities like spa and bar - subclass method");
    }
}
