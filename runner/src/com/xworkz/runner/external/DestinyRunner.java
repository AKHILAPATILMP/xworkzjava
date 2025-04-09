package com.xworkz.runner.external;

import com.xworkz.runner.internal.Destiny;

public class DestinyRunner {
    public static void main(String[] args) {
        Destiny destiny = new Destiny("What is meant to happen", "Fate and future", 9.4);
        System.out.println("destiny" + destiny.toString());
    }
}
