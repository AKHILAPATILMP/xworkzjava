package com.xworkz.runner.external;

import com.xworkz.runner.internal.Heater;

public class HeaterRunner {
    public static void main(String[] args) {
        Heater heater = new Heater("Bajaj", "Room", 3200);
        System.out.println("heater" + heater.toString());
    }
}
