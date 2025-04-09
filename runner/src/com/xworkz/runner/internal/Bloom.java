package com.xworkz.runner.internal;

public class Bloom {


        private String flowerName;
        private String season;
        private int lifespanInDays;

        public Bloom(String flowerName, String season, int lifespanInDays) {
            this.flowerName = flowerName;
            this.season = season;
            this.lifespanInDays = lifespanInDays;
        }

        @Override
        public String toString() {
            return "[flowerName=" + flowerName + ", season=" + season + ", lifespanInDays=" + lifespanInDays + "]";
        }
}
