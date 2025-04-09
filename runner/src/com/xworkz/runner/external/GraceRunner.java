package com.xworkz.runner.external;

import com.xworkz.runner.internal.Grace;

public class GraceRunner {
    public static void main(String[] args) {
        Grace grace = new Grace("Elegance and mercy", "Gentle breeze", 8.0);
        System.out.println("grace" + grace.toString());
    }
}
