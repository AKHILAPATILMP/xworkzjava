package com.xworkz.runner.external;

import com.xworkz.runner.internal.Whisper;

public class WhisperRunner {
    public static void main(String[] args) {
        Whisper whisper = new Whisper("Soft", true, 2);
        System.out.println("Whisper details: " + whisper.toString());

        int hash = whisper.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("murmur: " + "murmur".hashCode());
        System.out.println("hush: " + "hush".hashCode());
        System.out.println("quiet: " + "quiet".hashCode());

        System.out.println("Original: " + System.identityHashCode(whisper));
    }
}
