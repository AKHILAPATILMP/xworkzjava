package com.xworkz.runner.external;

import com.xworkz.runner.internal.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard("Wood", "White", 5000);
        System.out.println("cupboard" + cupboard.toString());
    }
}
