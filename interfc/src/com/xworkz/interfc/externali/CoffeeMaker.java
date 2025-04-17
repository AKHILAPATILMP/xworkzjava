package com.xworkz.interfc.externali;

public interface CoffeeMaker {
    void brew();
    void adjustStrength();
    void keepWarm();
    default void makes(){
        System.out.println("coffee maker ");
    }
}
