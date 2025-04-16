package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Speaker;

public class SmartSpeaker implements Speaker {

    public void playMusic() {
        System.out.println("Playing music on the smart speaker...");
    }

    @Override
    public void playSound() {
        System.out.println("play sound");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing volume on the smart speaker...");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("decrease the volume");
    }

}