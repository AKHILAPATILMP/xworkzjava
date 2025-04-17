package com.xworkz.interfc.externali;

public interface Oven {
    void bake();

    void grill();

    void preheat();

    default void heat() {
        System.out.println("heat");
    }
}