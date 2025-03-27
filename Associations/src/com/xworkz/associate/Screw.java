package com.xworkz.associate;

public class Screw {

        private String size;
        private String material;

        public Screw(String size, String material) {
            this.size = size;
            this.material = material;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void displayInfo() {
            System.out.println("Screw Size: " + size + ", Material: " + material);
        }
    }


