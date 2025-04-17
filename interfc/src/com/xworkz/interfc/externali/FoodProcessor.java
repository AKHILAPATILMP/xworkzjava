package com.xworkz.interfc.externali;

public interface FoodProcessor {
    void chop();
    void slice();
    void knead();
    default void food(){
        System.out.println("food is clean");
    }
}
