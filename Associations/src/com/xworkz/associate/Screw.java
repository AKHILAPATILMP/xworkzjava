package com.xworkz.associate;

public class Screw {
        private String material;
        private final int length;

        public Screw(int length) {
            System.out.println("Running non-static method Screw");
            this.length = length;
            this.material = "Steel"; // Default value
            System.out.println("Length: " + this.length + "mm");
            System.out.println("Material: " + this.material);
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return this.material;
        }
    }