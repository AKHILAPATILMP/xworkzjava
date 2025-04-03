package com.xworkz.isarelation.whiteboard;

    public class SmartWhiteboard extends WhiteBoard {
        public SmartWhiteboard() {
            super();
            System.out.println("SmartWhiteboard constructor is running");
        }

        public void connectToWiFi() {
            System.out.println("SmartWhiteboard is connecting to WiFi");
        }

        public void digitalWrite() {
            System.out.println("SmartWhiteboard is writing digitally");
        }

        public void screenShare() {
            System.out.println("SmartWhiteboard is sharing the screen");
        }

        public void voiceControl() {
            System.out.println("SmartWhiteboard is responding to voice commands");
        }

        public void saveContent() {
            System.out.println("SmartWhiteboard is saving the content digitally");
        }
    }

