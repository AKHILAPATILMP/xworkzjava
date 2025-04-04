package com.xworkz.isarelation.helmet;
public class SmartHelmet extends Helmet {

    public SmartHelmet() {
        super();
        System.out.println("SmartHelmet constructor is running - subclass");
    }

    @Override
    public void wear() {
        System.out.println("Wearing a smart helmet with sensors - subclass");
    }

    @Override
    public void remove() {
        System.out.println("Removing the smart helmet - subclass");
    }

    @Override
    public void adjustStrap() {
        System.out.println("Adjusting smart strap with auto-lock - subclass");
    }

    @Override
    public void protectHead() {
        System.out.println("Smart helmet provides enhanced head protection - subclass");
    }
}

