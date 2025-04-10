package com.xworkz.runner.external;

import com.xworkz.runner.internal.Couch;

public class CouchRunner {
    public static void main(String[] args) {
        Couch couch = new Couch("Leather", 3, 15500.0);
        String couchString = couch.toString();
        System.out.println("Couch details: " + couchString);

        int hash = couch.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "sofa";
        String two = "lounger";
        String three = "sectional";

        System.out.println("sofa: " + one.hashCode());
        System.out.println("lounger: " + two.hashCode());
        System.out.println("sectional: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(couch));
    }
}
