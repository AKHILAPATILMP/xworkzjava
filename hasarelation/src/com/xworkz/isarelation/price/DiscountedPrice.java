package com.xworkz.isarelation.price;
    public class DiscountedPrice extends Price {
        public DiscountedPrice() {
            super();
            System.out.println("DiscountedPrice constructor is running");
        }

        public void applyDiscount() {
            System.out.println("DiscountedPrice: Applying discount on the product...");
        }

        public void showSavings() {
            System.out.println("DiscountedPrice: Showing how much money is saved...");
        }

        public void calculateLoyaltyDiscount() {
            System.out.println("DiscountedPrice: Calculating loyalty program discount...");
        }

        public void seasonalDiscount() {
            System.out.println("DiscountedPrice: Offering seasonal discounts...");
        }

        public void clearanceSale() {
            System.out.println("DiscountedPrice: Applying clearance sale prices...");
        }
    }

