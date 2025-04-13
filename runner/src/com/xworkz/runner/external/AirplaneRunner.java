package com.xworkz.runner.external;

import com.xworkz.runner.internal.Airplane;

public class AirplaneRunner {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("IndiGo", 180, 4500);
        String airplaneString = airplane.toString();
        System.out.println("airplane" + airplaneString);

        int code=airplane.hashCode();
        System.out.println("value using ref  "+code);

        System.out.println("hash code sets");
        String value="home";
        System.out.println("home " +value.hashCode());
        String value2="house";
        System.out.println("house "+value2.hashCode());
        String value3="griha";
        System.out.println("griha "+value3.hashCode());

        System.out.println("original "+System.identityHashCode(airplane));


    }
}
