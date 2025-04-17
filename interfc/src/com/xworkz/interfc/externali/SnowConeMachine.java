package com.xworkz.interfc.externali;

public interface SnowConeMachine {
    void makeSnowCones();
    void serveSnowCones();
    void cleanMachine();
    default void snow() {
        System.out.println("snow");
    }
}
