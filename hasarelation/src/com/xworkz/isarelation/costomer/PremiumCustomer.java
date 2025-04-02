package com.xworkz.isarelation.costomer;

    public class PremiumCustomer extends Customer {
        public PremiumCustomer() {
            super();
            System.out.println("PremiumCustomer constructor is running");
        }

        public void getDiscounts() {
            System.out.println("PremiumCustomer: Receiving exclusive discounts...");
        }

        public void freeDelivery() {
            System.out.println("PremiumCustomer: Enjoying free delivery...");
        }

        public void earlyAccess() {
            System.out.println("PremiumCustomer: Getting early access to sales...");
        }

        public void prioritySupport() {
            System.out.println("PremiumCustomer: Receiving priority customer support...");
        }

        public void loyaltyRewards() {
            System.out.println("PremiumCustomer: Earning loyalty rewards...");
        }
    }

