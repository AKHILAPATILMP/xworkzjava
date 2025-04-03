package com.xworkz.isarelation.bed;

    public class SmartBed extends Bed {
        public SmartBed() {
            super();
            System.out.println("SmartBed constructor is running");
        }

        public void massage() {
            System.out.println("Bed is providing a massage");
        }

        public void temperatureControl() {
            System.out.println("Bed is adjusting temperature settings");
        }

        public void voiceControl() {
            System.out.println("Bed is responding to voice commands");
        }

        public void autoAdjust() {
            System.out.println("Bed is automatically adjusting to sleeping posture");
        }
    }

