package com.xworkz.interfc.externali;

public interface SmartFridge {
    void storeFood();
    void monitorTemperature();
    void alertExpiry();
    default void fridge() {
        System.out.println("fridge");
    }
}
