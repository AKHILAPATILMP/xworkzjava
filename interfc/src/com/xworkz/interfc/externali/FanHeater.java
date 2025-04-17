package com.xworkz.interfc.externali;

public interface FanHeater {
    void heat();
    void cool();
    void adjustTemperature();
    default void low(){
        System.out.println("low");
    }
}
