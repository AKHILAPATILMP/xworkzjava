package com.xworkz.runner.external;

import com.xworkz.runner.internal.Vanity;

public class VanityRunner {
    public static void main(String[] args) {
        Vanity vanity = new Vanity("Wood", "Ivory", 5500);
        System.out.println("vanity" + vanity.toString());
    }
}
