package com.xworkz.associate;

public class Board {

        private String capacitor;
        private String material;

        public Board(String capacitor, String material) {
            this.capacitor = capacitor;
            this.material = material;
        }

        public String getCapacitor() {
            return capacitor;
        }

        public void setCapacitor(String capacitor) {
            this.capacitor = capacitor;
        }

        public void displayInfo() {
            System.out.println("Board Capacitor: " + capacitor + ", Material: " + material);
        }
    }


