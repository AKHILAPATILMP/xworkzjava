package com.xworkz.runner.external;

import com.xworkz.runner.internal.Whisper;

public class WhisperRunner {
    public static void main(String[] args) {
        Whisper whisper = new Whisper("A soft or low speech", "Secrets and subtlety", 7.5);
        System.out.println("whisper" + whisper.toString());
    }
}
