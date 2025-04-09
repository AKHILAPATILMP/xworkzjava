package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bench;

public class BenchRunner {
    public static void main(String[] args) {
        Bench bench = new Bench("Wood", "Natural", 2000);
        System.out.println("bench" + bench.toString());
    }
}
