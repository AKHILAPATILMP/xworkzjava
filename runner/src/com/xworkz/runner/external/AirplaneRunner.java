package com.xworkz.runner.external;

import com.xworkz.runner.internal.Airplane;

public class AirplaneRunner {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("IndiGo", 180, 4500);
        String airplaneString = airplane.toString();
        System.out.println("airplane" + airplaneString);
    }
}
