package com.xworkz.isarelation.chips;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Chips");
        Chips chips = new Chips();
        chips.openPacket();
        chips.eatChips();
        chips.throwWrapper();
        chips.shareChips();

        System.out.println("\nCreating an instance of MasalaChips using Chips reference");
        Chips chipsRef = new MasalaChips();
        chipsRef.openPacket();
        chipsRef.eatChips();
        chipsRef.throwWrapper();
        chipsRef.shareChips();

        System.out.println("\nCreating an instance of MasalaChips using subclass reference");
        MasalaChips masalaChips = new MasalaChips();
        masalaChips.openPacket();
        masalaChips.eatChips();
        masalaChips.throwWrapper();
        masalaChips.shareChips();
    }
}
