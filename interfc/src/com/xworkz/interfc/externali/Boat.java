package com.xworkz.interfc.externali;

public interface Boat {
    void sail();
    void anchor();
    void navigate();
    default void move(){
        System.out.println("boat moves");
    }
}
