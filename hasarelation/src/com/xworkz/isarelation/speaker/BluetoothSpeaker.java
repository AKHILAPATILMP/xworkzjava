package com.xworkz.isarelation.speaker;
public class BluetoothSpeaker extends Speaker {

    public BluetoothSpeaker() {
        super();
        System.out.println("BluetoothSpeaker constructor is running - subclass");
    }

    @Override
    public void powerOn() {
        System.out.println("BluetoothSpeaker is powered on and ready to connect - subclass");
    }

    @Override
    public void playSound() {
        System.out.println("BluetoothSpeaker is streaming sound wirelessly - subclass");
    }

    @Override
    public void increaseVolume() {
        System.out.println("BluetoothSpeaker volume increased using touch controls - subclass");
    }

    @Override
    public void powerOff() {
        System.out.println("BluetoothSpeaker is powered off and disconnected - subclass");
    }
}


