package com.xworkz.runner.external;

import com.xworkz.runner.internal.Helicopter;

public class HelicopterRunner {
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter("Airbus H130", 6, 180000000);
        String helicopterString = helicopter.toString();
        System.out.println("helicopter" + helicopterString);
    }
}
