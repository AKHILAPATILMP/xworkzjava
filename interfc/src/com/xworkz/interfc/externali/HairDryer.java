package com.xworkz.interfc.externali;

public interface HairDryer {
    void dryHair();
    void adjustSpeed();
    void coolDown();
    default void hair(){
        System.out.println("hair");
    }
}
