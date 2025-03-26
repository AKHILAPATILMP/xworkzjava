package com.xworkz.vechile;

public class Car {
        public String brand;
        int speed;
        private String type;

        public Car(String brand, int speed, String type) {
            this.brand = brand;
            this.speed = speed;
            this.type = type;
            drive();
        }

        public void drive() {
            System.out.println(brand + " is driving at " + speed + " km/h.");
            showType();
        }

        void showSpeed() {
            System.out.println("Speed: " + speed + " km/h");
        }

        private void showType() {
            System.out.println("Car Type: " + type);
        }
    }


