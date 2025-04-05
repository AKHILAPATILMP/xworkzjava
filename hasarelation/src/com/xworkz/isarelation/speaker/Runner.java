package com.xworkz.isarelation.speaker;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Speaker");
        Speaker speaker = new Speaker();
        speaker.powerOn();
        speaker.playSound();
        speaker.increaseVolume();
        speaker.powerOff();

        System.out.println("\nCreating an instance of BluetoothSpeaker using Speaker reference");
        Speaker speakerRef = new BluetoothSpeaker();
        speakerRef.powerOn();
        speakerRef.playSound();
        speakerRef.increaseVolume();
        speakerRef.powerOff();

        System.out.println("\nCreating an instance of BluetoothSpeaker using subclass reference");
        BluetoothSpeaker bluetoothSpeaker = new BluetoothSpeaker();
        bluetoothSpeaker.powerOn();
        bluetoothSpeaker.playSound();
        bluetoothSpeaker.increaseVolume();
        bluetoothSpeaker.powerOff();
    }
}


