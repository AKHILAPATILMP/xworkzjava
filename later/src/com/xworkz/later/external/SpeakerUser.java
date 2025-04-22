package com.xworkz.later.external;

import com.xworkz.later.internal.Speaker;

public class SpeakerUser {

    Speaker speaker;

    public SpeakerUser(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("SpeakerUser is initialized");
    }

    public void activate() {
        if (this.speaker != null) {
            this.speaker.playSound();
        } else {
            System.out.println("No speaker to play sound");
        }
    }
}
