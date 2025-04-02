package com.xworkz.isarelation.price;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Price");
            Price price = new Price();
            price.setBasePrice();
            price.applyTax();
            price.displayFinalPrice();
            price.comparePrices();
            price.updatePrice();

            System.out.println("\nCreating an instance of DiscountedPrice using Price reference");
            Price priceRef = new DiscountedPrice();
            priceRef.setBasePrice();
            priceRef.applyTax();
            priceRef.displayFinalPrice();
            priceRef.comparePrices();
            priceRef.updatePrice();

            System.out.println("\nCreating an instance of DiscountedPrice using subclass reference");
            DiscountedPrice discountedPrice = new DiscountedPrice();
            discountedPrice.setBasePrice();
            discountedPrice.applyTax();
            discountedPrice.displayFinalPrice();
            discountedPrice.comparePrices();
            discountedPrice.updatePrice();
            discountedPrice.applyDiscount();
            discountedPrice.showSavings();
            discountedPrice.calculateLoyaltyDiscount();
            discountedPrice.seasonalDiscount();
            discountedPrice.clearanceSale();
        }
    }

