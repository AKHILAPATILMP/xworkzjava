package com.xworkz.equals.external;

import com.xworkz.equals.internal.Hand;

public class HandRunner {
    public static void main(String[] args) {

        Hand hand1 = new Hand();
        hand1.setType("Right");
        hand1.setNumberOfFingers(5);
        hand1.setIsDominant(true);

        Hand hand2 = new Hand();
        hand2.setType("Right");
        hand2.setNumberOfFingers(5);
        hand2.setIsDominant(true);

        boolean same = hand1.equals(hand2);
        System.out.println("hand1 equals hand2: " + same);

        System.out.println("Hand 1: " + hand1);
        System.out.println("Hand 2: " + hand2);

        System.out.println("Hand 1 hashCode: " + hand1.hashCode());
        System.out.println("Hand 2 hashCode: " + hand2.hashCode());
    }
}
