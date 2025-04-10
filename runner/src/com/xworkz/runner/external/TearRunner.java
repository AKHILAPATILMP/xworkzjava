package com.xworkz.runner.external;

import com.xworkz.runner.internal.Tear;

public class TearRunner {
    public static void main(String[] args) {
        Tear tear = new Tear(true, "Joy", 0.5);
        String tearString = tear.toString();
        System.out.println("Tear details: " + tearString);

        int hash = tear.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "joy";
        String two = "pain";
        String three = "grief";

        System.out.println("joy: " + one.hashCode());
        System.out.println("pain: " + two.hashCode());
        System.out.println("grief: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(tear));
    }
}
