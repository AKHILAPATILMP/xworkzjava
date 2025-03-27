package com.xworkz.associate;

public class Wire {

        private String quality;
        private int length;

        public Wire(String quality, int length) {
            this.quality = quality;
            this.length = length;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public void displayInfo() {
            System.out.println("Wire Quality: " + quality + ", Length: " + length + " meters");
        }
    }


