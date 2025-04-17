package com.xworkz.interfc.externali;

public interface FanCooler {
    void cool();
    void adjustSpeed();
    void oscillate();
    default void fanrotate (){
        System.out.println("fan rotate");
    }
}
