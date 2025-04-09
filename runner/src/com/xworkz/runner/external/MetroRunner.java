package com.xworkz.runner.external;

import com.xworkz.runner.internal.Metro;

public class MetroRunner {
    public static void main(String[] args) {
        Metro metro = new Metro("Purple Line", 6, 50);
        String metroString = metro.toString();
        System.out.println("metro" + metroString);
    }
}
