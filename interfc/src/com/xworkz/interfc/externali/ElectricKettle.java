package com.xworkz.interfc.externali;

public interface ElectricKettle {
    void boilWater();
    void keepWarm();
    void turnOff();
    default void kettle(){
        System.out.println("kettle is electric");
    }
}
