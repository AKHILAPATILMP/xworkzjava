package com.xworkz.isarelation.chips;

public class MasalaChips extends Chips {

    public MasalaChips() {
        super();
        System.out.println("MasalaChips constructor is running - subclass");
    }

    @Override
    public void openPacket() {
        System.out.println("Opening a spicy masala chips packet - subclass");
    }

    @Override
    public void eatChips() {
        System.out.println("Eating hot and tangy masala chips - subclass");
    }

    @Override
    public void throwWrapper() {
        System.out.println("Disposing masala chips wrapper responsibly - subclass");
    }

    @Override
    public void shareChips() {
        System.out.println("Sharing spicy masala chips with friends - subclass");
    }
}
