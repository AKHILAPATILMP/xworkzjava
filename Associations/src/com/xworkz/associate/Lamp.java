package com.xworkz.associate;

public class Lamp {

        private String warranty;
        private final String brand;

        public Lamp(String warranty, String brand) {
            this.warranty = warranty;
            this.brand = brand;
        }

        public String getWarranty() {
            return warranty;
        }

        public void setWarranty(String warranty) {
            this.warranty = warranty;
        }

        public void displayInfo() {
            System.out.println("Lamp Warranty: " + warranty + ", Brand: " + brand);
        }
    }


