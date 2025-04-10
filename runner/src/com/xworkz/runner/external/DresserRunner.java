package com.xworkz.runner.external;

import com.xworkz.runner.internal.Dresser;

public class DresserRunner {
    public static void main(String[] args) {
        Dresser dresser = new Dresser("Wood", 6, 4.2);
        String dresserString = dresser.toString();
        System.out.println("Dresser details: " + dresserString);

        int hash = dresser.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "closet";
        String two = "organizer";
        String three = "chest";

        System.out.println("closet: " + one.hashCode());
        System.out.println("organizer: " + two.hashCode());
        System.out.println("chest: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(dresser));
    }
}
