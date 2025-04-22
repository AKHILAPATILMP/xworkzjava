package com.xworkz.later.internal;

public class CardboardImpl implements Cardboard {

    public CardboardImpl() {
        super();
        System.out.println("CardboardImpl constructor running");
    }

    @Override
    public void fold() {
        System.out.println("Cardboard is being folded...");
    }
}
