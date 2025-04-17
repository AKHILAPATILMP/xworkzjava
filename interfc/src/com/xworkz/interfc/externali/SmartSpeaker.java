package com.xworkz.interfc.externali;

public interface SmartSpeaker {
    void playMusic();
    void adjustVolume();
    void voiceControl();
    default void speaker() {
        System.out.println("speaker");
    }
}
