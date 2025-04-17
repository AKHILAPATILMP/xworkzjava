package com.xworkz.interfc.externali;

public interface Taxi {
    void hailTaxi();
    void ride();
    void payFare();
    default void olataxi() {
        System.out.println("olataxi");
    }
}
