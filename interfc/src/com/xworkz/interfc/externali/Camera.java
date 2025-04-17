package com.xworkz.interfc.externali;

public interface Camera {
    void capturePhoto();
    void recordVideo();
    void zoom();
    default void lens(){
        System.out.println("cam has lens");
    }
}
