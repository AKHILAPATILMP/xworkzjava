package com.xworkz.later.internal;

public class SpeakerImpl implements Speaker {

    public SpeakerImpl() {
        super();
        System.out.println("SpeakerImpl constructor running");
    }

    @Override
    public void playSound() {
        System.out.println("Speaker is playing sound...");
    }
}
