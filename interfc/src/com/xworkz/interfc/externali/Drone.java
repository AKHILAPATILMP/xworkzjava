package com.xworkz.interfc.externali;

public interface Drone {
    void fly();
    void recordVideo();
    void takePhotos();
    default void highfly(){
        System.out.println("high fly");
    }
}
