package com.xworkz.runner.external;

import com.xworkz.runner.internal.Laughter;

public class LaughterRunner {
    public static void main(String[] args) {
        Laughter laughter = new Laughter("Giggle", "Joke", 65.3);
        String laughterString = laughter.toString();
        System.out.println("Laughter details: " + laughterString);

        int hash = laughter.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "smile";
        String two = "funny";
        String three = "joy";

        System.out.println("smile: " + one.hashCode());
        System.out.println("funny: " + two.hashCode());
        System.out.println("joy: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(laughter));
    }
}
