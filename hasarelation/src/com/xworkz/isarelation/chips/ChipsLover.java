package com.xworkz.isarelation.chips;

public class ChipsLover {
    public void enjoy(Chips chips) {
        chips.openPacket();
        chips.eat();
        chips.crunch();
        chips.smell();
        chips.throwWrapper();

        if (chips instanceof PotatoChips) {
            System.out.println("Casting: Chips is instance of PotatoChips");
            PotatoChips lays = (PotatoChips) chips;
            lays.shareChips();
        }
    }
}
