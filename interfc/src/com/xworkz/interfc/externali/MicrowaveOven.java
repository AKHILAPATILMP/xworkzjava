package com.xworkz.interfc.externali;

public interface MicrowaveOven {
    void microwave();

    void bake();

    void grill();

    default void oven() {
        System.out.println("oven");
    }
}