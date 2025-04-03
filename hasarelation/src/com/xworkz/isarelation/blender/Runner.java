package com.xworkz.isarelation.blender;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartBlender using Blender reference");
            Blender blenderRef = new SmartBlender();
            blenderRef.powerOn();
            blenderRef.blend();
            blenderRef.setSpeed();
            blenderRef.stopBlending();
            blenderRef.powerOff();

            System.out.println("\nCreating an instance of SmartBlender using subclass reference");
            SmartBlender smartBlender = new SmartBlender();
            smartBlender.powerOn();
            smartBlender.blend();
            smartBlender.setSpeed();
            smartBlender.stopBlending();
            smartBlender.powerOff();
            smartBlender.connectToWiFi();
            smartBlender.voiceControl();
            smartBlender.autoBlendMode();
            smartBlender.touchControl();
            smartBlender.energySavingMode();
        }
    }

