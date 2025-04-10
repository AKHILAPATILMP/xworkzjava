package com.xworkz.runner.external;

import com.xworkz.runner.internal.Truth;

public class TruthRunner {
    public static void main(String[] args) {
        Truth truth = new Truth("Honesty", true, 10);
        System.out.println("Truth details: " + truth.toString());

        int hash = truth.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("honesty: " + "honesty".hashCode());
        System.out.println("loyalty: " + "loyalty".hashCode());
        System.out.println("justice: " + "justice".hashCode());

        System.out.println("Original: " + System.identityHashCode(truth));
    }
}
