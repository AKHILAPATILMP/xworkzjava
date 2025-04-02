package com.xworkz.isarelation.glass;

    public class TemperedGlass extends Glass {
        public TemperedGlass() {
            super();
            System.out.println("TemperedGlass constructor is running");
        }

        public void strengthen() {
            System.out.println("TemperedGlass: Strengthened to be impact-resistant...");
        }

        public void heatResistant() {
            System.out.println("TemperedGlass: Withstands high temperatures...");
        }

        public void shatterSafely() {
            System.out.println("TemperedGlass: Breaks into small, safe pieces...");
        }

        public void scratchResistant() {
            System.out.println("TemperedGlass: More resistant to scratches...");
        }

        public void durable() {
            System.out.println("TemperedGlass: More durable than regular glass...");
        }
    }

