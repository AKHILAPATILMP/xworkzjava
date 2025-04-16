package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Speaker;

public class SpeakerImpli implements Speaker {
    @Override
    public void playSound() {
        System.out.println("Speaker playing sound");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Speaker volume increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Speaker volume decreased");
    }
}
