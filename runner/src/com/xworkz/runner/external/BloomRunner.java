package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bloom;

public class BloomRunner {
    public static void main(String[] args) {
        Bloom bloom = new Bloom("Rose", "Spring", 8.5);
        String bloomString = bloom.toString();
        System.out.println("Bloom details: " + bloomString);

        int hash = bloom.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "petal";
        String two = "stem";
        String three = "thorn";

        System.out.println("petal: " + one.hashCode());
        System.out.println("stem: " + two.hashCode());
        System.out.println("thorn: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(bloom));
    }
}
