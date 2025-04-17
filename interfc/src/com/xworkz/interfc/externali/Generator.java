package com.xworkz.interfc.externali;

public interface Generator {
    void start();
    void stop();
    void adjustPower();
    default void off(){
        System.out.println("off the generator");
    }
}
