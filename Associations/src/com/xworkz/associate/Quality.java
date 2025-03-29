package com.xworkz.associate;

public class Quality {

        private String resolution;
        private int refreshRate;

        public Quality(String resolution, int refreshRate) {
            this.resolution = resolution;
            this.refreshRate = refreshRate;
        }

        public void displayQualityDetails() {
            System.out.println("Resolution: " + this.resolution);
            System.out.println("Refresh Rate: " + this.refreshRate + " Hz");
        }
    }

