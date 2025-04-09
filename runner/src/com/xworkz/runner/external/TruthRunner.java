package com.xworkz.runner.external;

import com.xworkz.runner.internal.Truth;

public class TruthRunner {
    public static void main(String[] args) {
        Truth truth = new Truth("That which is real or factual", "Light and clarity", 10.0);
        System.out.println("truth" + truth.toString());
    }
}
