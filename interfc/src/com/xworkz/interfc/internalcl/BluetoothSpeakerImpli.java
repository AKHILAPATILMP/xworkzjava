package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Speaker;

public class BluetoothSpeakerImpli implements Speaker {

    @Override
    public void playSound() {
        System.out.println("Bluetooth speaker playing sound");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Bluetooth speaker volume increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Bluetooth speaker volume decreased");
    }
}
