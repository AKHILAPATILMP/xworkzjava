package com.xworkz.later.internal;

public class FridgeImpl implements Fridge {

    public FridgeImpl() {
        super();
        System.out.println("FridgeImpl constructor running");
    }

    @Override
    public void cool() {
        System.out.println("Fridge is cooling...");
    }
}
