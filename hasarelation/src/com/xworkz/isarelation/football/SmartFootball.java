package com.xworkz.isarelation.football;

    public class SmartFootball extends Football {
        public SmartFootball() {
            super();
            System.out.println("SmartFootball constructor is running");
        }

        public void trackSpeed() {
            System.out.println("SmartFootball is tracking the ball's speed");
        }

        public void measureImpact() {
            System.out.println("SmartFootball is measuring impact force");
        }

        public void connectToApp() {
            System.out.println("SmartFootball is connecting to a mobile app");
        }

        public void provideTrainingTips() {
            System.out.println("SmartFootball is providing training tips");
        }

        public void enableGPS() {
            System.out.println("SmartFootball has enabled GPS tracking");
        }
    }

