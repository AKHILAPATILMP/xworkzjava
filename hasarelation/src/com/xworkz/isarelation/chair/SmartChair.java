package com.xworkz.isarelation.chair;

    public class SmartChair extends Chair {
        public SmartChair() {
            super();
            System.out.println("SmartChair constructor is running");
        }

        public void massage() {
            System.out.println("Chair is providing a massage");
        }

        public void heatControl() {
            System.out.println("Chair is adjusting heat settings");
        }

        public void voiceControl() {
            System.out.println("Chair is responding to voice commands");
        }

        public void autoRecline() {
            System.out.println("Chair is reclining automatically");
        }
    }

