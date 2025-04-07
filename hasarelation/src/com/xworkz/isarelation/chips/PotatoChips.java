package com.xworkz.isarelation.chips;

public class PotatoChips extends Chips {

    public PotatoChips() {
        super();
        System.out.println("PotatoChips constructor is running - subclass");
    }

    @Override
    public void openPacket() {
        System.out.println("Opening a Lays packet - subclass");
    }

    @Override
    public void eat() {
        System.out.println("Eating salted potato chips - subclass");
    }

    @Override
    public void crunch() {
        System.out.println("Crunching thin potato chips - subclass");
    }

    @Override
    public void smell() {
        System.out.println("Smelling tangy masala chips - subclass");
    }

    @Override
    public void throwWrapper() {
        System.out.println("Throwing Lays wrapper into recycle bin - subclass");
    }

    public void shareChips() {
        System.out.println("Sharing potato chips with friends - only in subclass");
    }
}
