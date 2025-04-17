package com.xworkz.interfc.externali;

public interface Speaker {
    void playSound();
    void increaseVolume();
    void decreaseVolume();
    default public void speaker() {
        System.out.println("speaker");
    }
}
