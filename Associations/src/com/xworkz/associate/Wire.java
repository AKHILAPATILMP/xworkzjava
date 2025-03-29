package com.xworkz.associate;

public class Wire {

        private String type;
        private double length;
        private Quality quality;

        public Wire(String type, double length,Quality quality) {
            this.type = type;
            this.length = length;
            this.quality= quality;
        }

        public void displayWireDetails() {
            System.out.println("Wire Type: " + this.type);
            System.out.println("Wire Length: " + this.length + " meters");
            this.quality.displayQualityDetails();
        }
    }