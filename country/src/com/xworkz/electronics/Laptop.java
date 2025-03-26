package com.xworkz.electronics;

public class Laptop {

        public String brand;
        double price;
        private String processor;

        public Laptop(String brand, double price, String processor) {
            this.brand = brand;
            this.price = price;
            this.processor = processor;
        }

        public void showLaptop() {
            System.out.println("Laptop: " + brand + ", Price: $" + price);
            showProcessor();
        }

        void showPrice() {
            System.out.println("Price: $" + price);
        }

        private void showProcessor() {
            System.out.println("Processor: " + processor);
        }
    }


