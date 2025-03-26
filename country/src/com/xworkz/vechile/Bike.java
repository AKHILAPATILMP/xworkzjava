package com.xworkz.vechile;

public class Bike {
        public String brand;
        int speed;
        private String type;

        public Bike(String brand, int speed, String type) {
            this.brand = brand;
            this.speed = speed;
            this.type = type;
            ride();
        }

        public void ride() {
            System.out.println(brand + " is riding at " + speed + " km/h.");
            showType();
        }

        void showSpeed() {
            System.out.println("Speed: " + speed + " km/h");
        }

        private void showType() {
            System.out.println("Bike Type: " + type);
        }
    }


