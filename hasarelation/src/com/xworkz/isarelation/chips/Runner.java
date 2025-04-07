package com.xworkz.isarelation.chips;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Chips");
        Chips basic = new Chips();
        basic.openPacket();
        basic.eat();
        basic.crunch();
        basic.smell();
        basic.throwWrapper();

        System.out.println("\nCreating instance of PotatoChips using Chips reference");
        Chips ref = new PotatoChips();
        ref.openPacket();
        ref.eat();
        ref.crunch();
        ref.smell();
        ref.throwWrapper();

        System.out.println("\nCreating instance of PotatoChips using subclass reference");
        PotatoChips lays = new PotatoChips();
        lays.openPacket();
        lays.eat();
        lays.crunch();
        lays.smell();
        lays.throwWrapper();
        lays.shareChips();

        System.out.println("\nCasting and calling from ChipsLover");
        ChipsLover lover = new ChipsLover();
        lover.enjoy(basic);
        lover.enjoy(ref);
        lover.enjoy(lays);
    }
}
