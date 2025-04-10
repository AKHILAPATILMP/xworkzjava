package com.xworkz.runner.external;

import com.xworkz.runner.internal.Rhythm;

public class RhythmRunner {
    public static void main(String[] args) {
        Rhythm rhythm = new Rhythm("Jazz", 120, "Africa");
        String rhythmString = rhythm.toString();
        System.out.println("Rhythm details: " + rhythmString);

        int hash = rhythm.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "beat";
        String two = "groove";
        String three = "swing";

        System.out.println("beat: " + one.hashCode());
        System.out.println("groove: " + two.hashCode());
        System.out.println("swing: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(rhythm));
    }
}
