package com.xworkz.runner.external;

import com.xworkz.runner.internal.Change;

public class ChangeRunner {
    public static void main(String[] args) {
        Change change = new Change("Technological", "Innovation", 2024);
        String changeString = change.toString();
        System.out.println("Change details: " + changeString);

        int hash = change.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "adapt";
        String two = "shift";
        String three = "transition";

        System.out.println("adapt: " + one.hashCode());
        System.out.println("shift: " + two.hashCode());
        System.out.println("transition: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(change));
    }
}
