package com.xworkz.later.internal;

public class ButtonImpl implements Button {

    public ButtonImpl() {
        super();
        System.out.println("ButtonImpl constructor running");
    }

    @Override
    public void press() {
        System.out.println("Button is pressed...");
    }
}
