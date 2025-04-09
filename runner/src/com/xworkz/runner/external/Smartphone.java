package com.xworkz.runner.external;

public class Smartphone {

        private String brand;
        private int storage; // in GB
        private double price;

        public Smartphone(String brand, int storage, double price) {
            this.brand = brand;
            this.storage = storage;
            this.price = price;
        }

        @Override
        public String toString() {
            return "[brand=" + brand + ", storage=" + storage + "GB, price=" + price + "]";
        }
    }


