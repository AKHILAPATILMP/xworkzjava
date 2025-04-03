package com.xworkz.isarelation.speaker;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartSpeaker using Speaker reference");
            Speaker speakerRef = new SmartSpeaker();
            speakerRef.powerOn();
            speakerRef.playSound();
            speakerRef.adjustVolume();
            speakerRef.mute();
            speakerRef.powerOff();

            System.out.println("\nCreating an instance of SmartSpeaker using subclass reference");
            SmartSpeaker smartSpeaker = new SmartSpeaker();
            smartSpeaker.powerOn();
            smartSpeaker.playSound();
            smartSpeaker.adjustVolume();
            smartSpeaker.mute();
            smartSpeaker.powerOff();
            smartSpeaker.connectBluetooth();
            smartSpeaker.voiceAssistant();
            smartSpeaker.streamMusic();
            smartSpeaker.controlSmartHome();
            smartSpeaker.enableWiFi();
        }
    }

