package com.xworkz.runner.internal;

public class Laptop {

        private String brand;
        private int ramSize;
        private double price;

        public Laptop(String brand, int ramSize, double price) {
            this.brand = brand;
            this.ramSize = ramSize;
            this.price = price;
        }

        @Override
        public String toString() {
            return "[brand=" + brand + ", ramSize=" + ramSize + "GB, price=" + price + "]";
        }
    }

