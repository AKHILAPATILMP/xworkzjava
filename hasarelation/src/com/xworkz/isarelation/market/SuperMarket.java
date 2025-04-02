package com.xworkz.isarelation.market;
    public class SuperMarket extends Market {
        public SuperMarket() {
            super();
            System.out.println("SuperMarket constructor is running");
        }

        public void offerLoyaltyPoints() {
            System.out.println("SuperMarket: Providing loyalty points to customers...");
        }

        public void onlineDelivery() {
            System.out.println("SuperMarket: Offering home delivery services...");
        }

        public void selfCheckout() {
            System.out.println("SuperMarket: Enabling self-checkout systems...");
        }

        public void bulkBuyingOffers() {
            System.out.println("SuperMarket: Giving discounts on bulk purchases...");
        }

        public void membershipBenefits() {
            System.out.println("SuperMarket: Exclusive benefits for members...");
        }
    }

