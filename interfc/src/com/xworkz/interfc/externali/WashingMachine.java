package com.xworkz.interfc.externali;

public interface WashingMachine {
    void wash();
    void rinse();
    void spinDry();
    default  void washes() {
        System.out.println("washes");
    }
}

