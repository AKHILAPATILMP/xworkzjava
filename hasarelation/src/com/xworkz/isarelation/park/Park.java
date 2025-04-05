package com.xworkz.isarelation.park;

public class Park {

    public Park() {
        System.out.println("Park constructor is running - parent class");
    }

    public void open() {
        System.out.println("Park is open for visitors - parent class");
    }

    public void close() {
        System.out.println("Park is closed now - parent class");
    }

    public void maintain() {
        System.out.println("Park is being maintained - parent class");
    }

    public void provideSeating() {
        System.out.println("Providing benches for seating - parent class");
    }
}
