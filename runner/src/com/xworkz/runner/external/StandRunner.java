package com.xworkz.runner.external;

import com.xworkz.runner.internal.Stand;

public class StandRunner {
    public static void main(String[] args) {
        Stand stand = new Stand("Music", "Metal", 120.0);
        String standString = stand.toString();
        System.out.println("Stand details: " + standString);

        int hash = stand.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "holder";
        String two = "support";
        String three = "base";

        System.out.println("holder: " + one.hashCode());
        System.out.println("support: " + two.hashCode());
        System.out.println("base: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(stand));
    }
}
