package com.xworkz.runner.external;

import com.xworkz.runner.internal.Rose;

public class RoseRunner {
    public static void main(String[] args) {
        Rose rose = new Rose("Red", 8.5, true);
        String roseString = rose.toString();
        System.out.println("rose" + roseString);
    }
}
