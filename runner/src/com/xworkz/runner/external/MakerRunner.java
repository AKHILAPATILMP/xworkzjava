package com.xworkz.runner.external;

import com.xworkz.runner.internal.Maker;

public class MakerRunner {
    public static void main(String[] args) {
        Maker maker = new Maker("Coffee Maker", 4, 5000);
        System.out.println("maker" + maker.toString());
    }
}
