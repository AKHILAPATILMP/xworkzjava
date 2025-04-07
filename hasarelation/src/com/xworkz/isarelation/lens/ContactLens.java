package com.xworkz.isarelation.lens;

public class ContactLens extends Lens {

    public ContactLens() {
        super();
        System.out.println("ContactLens constructor is running - subclass");
    }

    @Override
    public void focus() {
        System.out.println("ContactLens focusing directly on eye - subclass");
    }

    @Override
    public void zoom() {
        System.out.println("ContactLens provides static zoom - subclass");
    }

    @Override
    public void clean() {
        System.out.println("ContactLens cleaned using lens solution - subclass");
    }

    @Override
    public void store() {
        System.out.println("ContactLens stored in lens box - subclass");
    }

    @Override
    public void adjust() {
        System.out.println("ContactLens adjusts automatically to eye - subclass");
    }

    public void wear() {
        System.out.println("Wearing the contact lens - subclass only");
    }
}
