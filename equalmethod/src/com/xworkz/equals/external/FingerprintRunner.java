package com.xworkz.equals.external;

import com.xworkz.equals.internal.Fingerprint;

public class FingerprintRunner {
    public static void main(String[] args) {

        Fingerprint fingerprint1 = new Fingerprint();
        fingerprint1.setPattern("Whorl");
        fingerprint1.setArea(20.5);  // area in cm²
        fingerprint1.setIsLeftHand(true);

        Fingerprint fingerprint2 = new Fingerprint();
        fingerprint2.setPattern("Whorl");  // same pattern
        fingerprint2.setArea(19.0);  // different area
        fingerprint2.setIsLeftHand(true);  // same hand type

        boolean same = fingerprint1.equals(fingerprint2);
        System.out.println("fingerprint1 equals fingerprint2: " + same);

        System.out.println("Fingerprint 1: " + fingerprint1);
        System.out.println("Fingerprint 2: " + fingerprint2);

        System.out.println("Fingerprint 1 hashCode: " + fingerprint1.hashCode());
        System.out.println("Fingerprint 2 hashCode: " + fingerprint2.hashCode());
    }
}
