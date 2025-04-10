package com.xworkz.runner.external;

import com.xworkz.runner.internal.Shadow;

public class ShadowRunner {
    public static void main(String[] args) {
        Shadow shadow = new Shadow("Human", 5.9, true);
        String shadowString = shadow.toString();
        System.out.println("Shadow details: " + shadowString);

        int hash = shadow.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "light";
        String two = "form";
        String three = "outline";

        System.out.println("light: " + one.hashCode());
        System.out.println("form: " + two.hashCode());
        System.out.println("outline: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(shadow));
    }
}
