package com.xworkz.runner.external;

import com.xworkz.runner.internal.TVStand;

public class TVStandRunner {
    public static void main(String[] args) {
        TVStand stand = new TVStand("Wood", 3, 4500.00);
        System.out.println("TV Stand details: " + stand.toString());

        int hash = stand.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("stand: " + "stand".hashCode());
        System.out.println("shelf: " + "shelf".hashCode());
        System.out.println("holder: " + "holder".hashCode());

        System.out.println("Original: " + System.identityHashCode(stand));
    }
}
