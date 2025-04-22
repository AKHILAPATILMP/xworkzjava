package com.xworkz.later.runner;

import com.xworkz.later.internal.Speaker;
import com.xworkz.later.internal.SpeakerImpl;
import com.xworkz.later.external.SpeakerUser;

public class SPRunner {
    public static void main(String[] args) {
        Speaker speaker = new SpeakerImpl();
        SpeakerUser speakerUser = new SpeakerUser(speaker); // abstraction
        speakerUser.activate();
    }
}
