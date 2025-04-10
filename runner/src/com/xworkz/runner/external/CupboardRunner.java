package com.xworkz.runner.external;

import com.xworkz.runner.internal.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard("Wood", 4, 6.2);
        String cupboardString = cupboard.toString();
        System.out.println("Cupboard details: " + cupboardString);

        int hash = cupboard.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "storage";
        String two = "locker";
        String three = "closet";

        System.out.println("storage: " + one.hashCode());
        System.out.println("locker: " + two.hashCode());
        System.out.println("closet: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(cupboard));
    }
}
