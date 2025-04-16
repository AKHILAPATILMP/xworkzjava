package com.xworkz.abstrct.internal;
//Declare an abstract class with three variables and declare a const to init 3 variables
public abstract class Device {
        String brand;
        String model;
        double price;

        public Device(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        abstract void powerOn();


        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: $" + price);
        }
    }


