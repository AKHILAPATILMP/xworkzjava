package com.xworkz.interfc.externali;

public interface CarCharger {
    void chargeBattery();
    void monitorPowerLevel();
    void adjustChargingSpeed();
    default void movecar(){
        System.out.println("move the car");
    }
}
