package com.xworkz.interfc.externali;

public interface BusStop {
    void waitForBus();
    void boardBus();
    void checkSchedule();
    default void large(){
        System.out.println("bs is large");
    }
}
