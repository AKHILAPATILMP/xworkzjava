package com.xworkz.equals.external;

import com.xworkz.equals.internal.Keypad;

public class KeypadRunner {
    public static void main(String[] args) {

        Keypad k1 = new Keypad();
        k1.setLayout("QWERTY");
        k1.setNumberOfKeys(104);
        k1.setIsBacklit(true);
        k1.setMaterial("Plastic");

        Keypad k2 = new Keypad();
        k2.setLayout("QWERTY");
        k2.setNumberOfKeys(104);
        k2.setIsBacklit(true);
        k2.setMaterial("Aluminum");

        boolean same = k1.equals(k2);
        System.out.println("k1 equals k2: " + same);

        System.out.println("Keypad 1: " + k1);
        System.out.println("Keypad 2: " + k2);

        System.out.println("Keypad 1 hashCode: " + k1.hashCode());
        System.out.println("Keypad 2 hashCode: " + k2.hashCode());
    }
}
