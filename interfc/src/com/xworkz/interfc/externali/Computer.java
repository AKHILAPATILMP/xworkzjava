package com.xworkz.interfc.externali;

public interface Computer {
    void start();
    void shutdown();
    void restart();
    default void operate(){
        System.out.println("operate the computer");
    }
}
