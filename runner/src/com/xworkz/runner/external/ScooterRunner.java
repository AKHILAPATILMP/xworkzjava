package com.xworkz.runner.external;

import com.xworkz.runner.internal.Scooter;

public class ScooterRunner {
    public static void main(String[] args) {
        Scooter scooter = new Scooter("Ola", "Electric", 95000);
        String scooterString = scooter.toString();
        System.out.println("scooter" + scooterString);
    }
}
