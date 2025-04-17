package com.xworkz.interfc.externali;

public interface GPSNavigator {
    void calculateRoute();
    void provideDirections();
    void setDestination();
    default void app(){
        System.out.println("app has navigate");
    }

    void hiar();
}
