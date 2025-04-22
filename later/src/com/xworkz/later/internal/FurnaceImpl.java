package com.xworkz.later.internal;

public class FurnaceImpl implements Furnace {

    public FurnaceImpl() {
        super();
        System.out.println("FurnaceImpl constructor running");
    }

    @Override
    public void heat() {
        System.out.println("Furnace is heating...");
    }
}
