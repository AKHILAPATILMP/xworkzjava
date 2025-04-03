package com.xworkz.isarelation.television;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartTelevision using Television reference");
            Television tvRef = new SmartTelevision();
            tvRef.powerOn();
            tvRef.changeChannel();
            tvRef.increaseVolume();
            tvRef.decreaseVolume();
            tvRef.powerOff();

            System.out.println("\nCreating an instance of SmartTelevision using subclass reference");
            SmartTelevision smartTV = new SmartTelevision();
            smartTV.powerOn();
            smartTV.changeChannel();
            smartTV.increaseVolume();
            smartTV.decreaseVolume();
            smartTV.powerOff();
            smartTV.connectToWiFi();
            smartTV.browseInternet();
            smartTV.streamOnlineContent();
            smartTV.voiceControl();
            smartTV.screenMirroring();
        }
    }

