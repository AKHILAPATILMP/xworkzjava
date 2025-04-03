package com.xworkz.isarelation.door;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartDoor using Door reference");
            Door doorRef = new SmartDoor();
            doorRef.open();
            doorRef.close();
            doorRef.lock();
            doorRef.unlock();
            doorRef.knock();

            System.out.println("\nCreating an instance of SmartDoor using subclass reference");
            SmartDoor smartDoor = new SmartDoor();
            smartDoor.open();
            smartDoor.close();
            smartDoor.lock();
            smartDoor.unlock();
            smartDoor.knock();
            smartDoor.fingerprintUnlock();
            smartDoor.remoteControl();
            smartDoor.autoLock();
            smartDoor.videoSurveillance();
            smartDoor.voiceControl();
        }
    }

