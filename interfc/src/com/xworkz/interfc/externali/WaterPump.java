package com.xworkz.interfc.externali;

public interface WaterPump {
    void pumpWater();
    void stopPump();
    void adjustPressure();
    default void pump() {
        System.out.println("pump");
    }
}
