package com.xworkz.runner.external;

import com.xworkz.runner.internal.Melody;

public class MelodyRunner {
    public static void main(String[] args) {
        Melody melody = new Melody("Classical", "Mozart", 4.25);
        String melodyString = melody.toString();
        System.out.println("Melody details: " + melodyString);

        int hash = melody.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "harmony";
        String two = "rhythm";
        String three = "tune";

        System.out.println("harmony: " + one.hashCode());
        System.out.println("rhythm: " + two.hashCode());
        System.out.println("tune: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(melody));
    }
}
