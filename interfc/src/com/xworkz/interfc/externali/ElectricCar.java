package com.xworkz.interfc.externali;

public interface ElectricCar {
    void charge();
    void drive();
    void monitorBattery();
    default void automate(){
        System.out.println("automate");
    }
}
