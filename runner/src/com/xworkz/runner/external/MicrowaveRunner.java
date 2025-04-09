package com.xworkz.runner.external;

import com.xworkz.runner.internal.Microwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Microwave microwave = new Microwave("LG", 800, 10000);
        System.out.println("microwave" + microwave.toString());
    }
}
