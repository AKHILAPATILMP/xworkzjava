package com.xworkz.interfc.externali;

public interface Satellite {
    void monitorWeather();
    void communicate();
    void trackLocation();
    default void stlt() {
        System.out.println("stlt");
    }
}
