package com.xworkz.runner.external;

import com.xworkz.runner.internal.Silence;

public class SilenceRunner {
    public static void main(String[] args) {
        Silence silence = new Silence("Meditative", 15, true);
        String silenceString = silence.toString();
        System.out.println("Silence details: " + silenceString);

        int hash = silence.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "calm";
        String two = "peace";
        String three = "mute";

        System.out.println("calm: " + one.hashCode());
        System.out.println("peace: " + two.hashCode());
        System.out.println("mute: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(silence));
    }
}
