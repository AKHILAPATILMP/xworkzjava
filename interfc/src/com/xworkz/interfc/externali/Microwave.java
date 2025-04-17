package com.xworkz.interfc.externali;

public interface Microwave {
    void heat();

    void defrost();

    void cook();

    default void wave() {
        System.out.println("wave");
    }
}