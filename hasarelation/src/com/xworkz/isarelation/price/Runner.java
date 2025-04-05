package com.xworkz.isarelation.price;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Price");
        Price price = new Price();
        price.showOriginalPrice();
        price.calculateTax();
        price.displayFinalPrice();
        price.priceTag();

        System.out.println("\nCreating an instance of DiscountedPrice using Price reference");
        Price priceRef = new DiscountedPrice();
        priceRef.showOriginalPrice();
        priceRef.calculateTax();
        priceRef.displayFinalPrice();
        priceRef.priceTag();

        System.out.println("\nCreating an instance of DiscountedPrice using subclass reference");
        DiscountedPrice discountedPrice = new DiscountedPrice();
        discountedPrice.showOriginalPrice();
        discountedPrice.calculateTax();
        discountedPrice.displayFinalPrice();
        discountedPrice.priceTag();
    }
}
