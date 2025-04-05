package com.xworkz.isarelation.price;
public class Price {

    public Price() {
        System.out.println("Price constructor is running - parent class");
    }

    public void showOriginalPrice() {
        System.out.println("Showing original product price - parent class");
    }

    public void calculateTax() {
        System.out.println("Calculating tax on product - parent class");
    }

    public void displayFinalPrice() {
        System.out.println("Displaying final price after tax - parent class");
    }

    public void priceTag() {
        System.out.println("Showing price tag - parent class");
    }
}
