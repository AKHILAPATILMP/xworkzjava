package com.xworkz.runner.external;

import com.xworkz.runner.internal.Stool;

public class StoolRunner {
    public static void main(String[] args) {
        Stool stool = new Stool("Wood", 45, 1200);
        System.out.println("stool" + stool.toString());
    }
}
