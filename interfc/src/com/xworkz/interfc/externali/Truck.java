package com.xworkz.interfc.externali;

public interface Truck {
    void loadCargo();
    void unloadCargo();

    void startEngine();

    void drive();
    default public void trucks() {
        System.out.println("trucks");
    }
}
