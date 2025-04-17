package com.xworkz.interfc.externali;

public interface Subway {
    void boardSubway();
    void travel();
    void disembark();
    default void sub() {
        System.out.println("sub");
    }
}
