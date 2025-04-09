package com.xworkz.runner.external;

import com.xworkz.runner.internal.Ocean;

public class OceanRunner {
    public static void main(String[] args) {
        Ocean ocean = new Ocean("A vast body of salt water", "Depth and emotion", 9.5);
        System.out.println("ocean" + ocean.toString());
    }
}
