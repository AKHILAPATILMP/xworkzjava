package com.xworkz.isarelation.window;

    public class SmartWindows extends Windows {
        public SmartWindows() {
            super();
            System.out.println("SmartWindows constructor is running");
        }

        public void autoTint() {
            System.out.println("Window is adjusting tint automatically");
        }

        public void rainSensor() {
            System.out.println("Window is closing due to rain detection");
        }

        public void voiceControl() {
            System.out.println("Window is responding to voice commands");
        }

        public void remoteControl() {
            System.out.println("Window is being controlled remotely");
        }
    }

