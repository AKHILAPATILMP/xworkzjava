package com.xworkz.runner.external;

import com.xworkz.runner.internal.Destiny;

public class DestinyRunner {
    public static void main(String[] args) {
        Destiny destiny = new Destiny("Fate", "Mythology", true);
        String destinyString = destiny.toString();
        System.out.println("Destiny details: " + destinyString);

        int hash = destiny.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "future";
        String two = "karma";
        String three = "fortune";

        System.out.println("future: " + one.hashCode());
        System.out.println("karma: " + two.hashCode());
        System.out.println("fortune: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(destiny));
    }
}
