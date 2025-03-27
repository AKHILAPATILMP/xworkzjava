package com.xworkz.associate;

public class Button {

        private String material;
        private String type;

        public Button(String material, String type) {
            this.material = material;
            this.type = type;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void displayInfo() {
            System.out.println("Button Material: " + material + ", Type: " + type);
        }
    }


