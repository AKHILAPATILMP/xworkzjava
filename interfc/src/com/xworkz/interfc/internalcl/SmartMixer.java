package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Mixer;

public class SmartMixer implements Mixer {

    @Override
    public void mix() {
        System.out.println("mix");
    }

    @Override
    public void stir() {
        System.out.println("stir");
    }

    @Override
    public void beat() {
        System.out.println("beat");
    }
}