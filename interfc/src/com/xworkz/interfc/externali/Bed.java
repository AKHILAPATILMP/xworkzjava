package com.xworkz.interfc.externali;

public interface Bed {
    void sleep();
    void makeBed();
    void adjustHeadrest();
    default void gotup(){
        System.out.println("got up from bed");
    }
}
