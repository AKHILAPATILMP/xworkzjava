package com.xworkz.associate;


    public class Remote {
        private String battery;
        private String brand;

        public Remote(String battery, String brand) {
            this.battery = battery;
            this.brand = brand;
        }

        public String getBattery() {
            return battery;
        }

        public void setBattery(String battery) {
            this.battery = battery;
        }

        public void displayInfo() {
            System.out.println("Remote Battery: " + battery + ", Brand: " + brand);
        }
    }


