package com.xworkz.isarelation.price;

public class DiscountedPrice extends Price {

    public DiscountedPrice() {
        super();
        System.out.println("DiscountedPrice constructor is running - subclass");
    }

    @Override
    public void showOriginalPrice() {
        System.out.println("Original price shown before discount - subclass");
    }

    @Override
    public void calculateTax() {
        System.out.println("Calculating tax after discount applied - subclass");
    }

    @Override
    public void displayFinalPrice() {
        System.out.println("Final price includes discount and tax - subclass");
    }

    @Override
    public void priceTag() {
        System.out.println("Showing discounted price tag - subclass");
    }
}
