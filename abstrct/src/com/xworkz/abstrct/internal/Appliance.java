package com.xworkz.abstrct.internal;
//Declare an abstract class with four variables and declare three constructors, with out no-arg constructor
public abstract class Appliance {
        String name;
        String brand;
        double power;
        double price;

        public Appliance(String name, String brand, double power, double price) {
            this.name = name;
            this.brand = brand;
            this.power = power;
            this.price = price;
        }


        public Appliance(String name, String brand) {
            this.name = name;
            this.brand = brand;
            this.power = 0.0;
            this.price = 0.0;
        }

        public Appliance(String name, String brand, double power) {
            this.name = name;
            this.brand = brand;
            this.power = power;
            this.price = 0.0;
        }

        abstract void operate();


        public void showDetails() {
            System.out.println("Appliance Name: " + name);
            System.out.println("Brand: " + brand);
            System.out.println("Power: " + power + "W");
            System.out.println("Price: $" + price);
        }
    }
