package com.xworkz.isarelation.sofa;

    public class SmartSofa extends Sofa {
        public SmartSofa() {
            super();
            System.out.println("SmartSofa constructor is running");
        }

        public void massage() {
            System.out.println("Sofa is providing a massage");
        }

        public void heatControl() {
            System.out.println("Sofa is adjusting heat settings");
        }

        public void voiceControl() {
            System.out.println("Sofa is responding to voice commands");
        }

        public void autoRecline() {
            System.out.println("Sofa is reclining automatically");
        }
    }

