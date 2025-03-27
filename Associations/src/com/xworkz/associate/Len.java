package com.xworkz.associate;

public class Len {

        private String lensType;
        private int focalLength;

        public Len(String lensType, int focalLength) {
            this.lensType = lensType;
            this.focalLength = focalLength;
        }

        public String getLensType() {
            return lensType;
        }

        public void setLensType(String lensType) {
            this.lensType = lensType;
        }

        public void displayInfo() {
            System.out.println("Lens Type: " + lensType + ", Focal Length: " + focalLength + " mm");
        }
    }


