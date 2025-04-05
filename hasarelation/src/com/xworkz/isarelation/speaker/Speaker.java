package com.xworkz.isarelation.speaker;

public class Speaker {

    public Speaker() {
        System.out.println("Speaker constructor is running - parent class");
    }

    public void powerOn() {
        System.out.println("Speaker is powered on - parent class");
    }

    public void playSound() {
        System.out.println("Speaker is playing sound - parent class");
    }

    public void increaseVolume() {
        System.out.println("Increasing volume - parent class");
    }

    public void powerOff() {
        System.out.println("Speaker is powered off - parent class");
    }
}
