package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.SmartSpeaker;

public class EchoSmartSpeaker implements SmartSpeaker {

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting volume level...");
    }

    @Override
    public void voiceControl() {
        System.out.println("Listening for voice commands...");
    }
}
