package com.xworkz.equals.external;

import com.xworkz.equals.internal.Key;

public class KeyRunner {
    public static void main(String[] args) {

        Key key1 = new Key();
        key1.setKeyType("House Key");

        Key key2 = new Key();
        key2.setKeyType("House Key");

        boolean same = key1.equals(key2);
        System.out.println("key1 equals key2: " + same);

        System.out.println("Key 1: " + key1);
        System.out.println("Key 2: " + key2);

        System.out.println("Key 1 hashCode: " + key1.hashCode());
        System.out.println("Key 2 hashCode: " + key2.hashCode());
    }
}
