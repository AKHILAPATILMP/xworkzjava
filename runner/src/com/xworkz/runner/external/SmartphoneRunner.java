package com.xworkz.runner.external;

import com.xworkz.runner.internal.Smartphone;

public class SmartphoneRunner {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", 128, 25000);
        String smartphoneString = smartphone.toString();
        System.out.println("smartphone" + smartphoneString);
    }
}