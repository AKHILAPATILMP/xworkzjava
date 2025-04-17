package com.xworkz.interfc.externali;

public interface Humidifier {
    void humidify();
    void dehumidify();
    void adjustMoistureLevel();
    default void humid(){
        System.out.println("humid");
    }
}
