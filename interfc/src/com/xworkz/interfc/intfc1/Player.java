package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.SmartSpeaker;
import com.xworkz.interfc.externali.Speaker;

public class Player implements SmartSpeaker, Speaker {
    @Override
    public void playMusic() {
        System.out.println("");
    }

    @Override
    public void adjustVolume() {
        System.out.println("");
    }

    @Override
    public void voiceControl() {
        System.out.println("");
    }

    @Override
    public void playSound() {
        System.out.println("");
    }

    @Override
    public void increaseVolume() {
        System.out.println("");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("");
    }
    @Override
    public void speaker() {
        System.out.println("speaker");
    }

}
