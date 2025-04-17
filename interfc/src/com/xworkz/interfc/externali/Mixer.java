package com.xworkz.interfc.externali;

public interface Mixer {
    void mix();

    void stir();

    void beat();

    default void grind() {
        System.out.println("grind");
    }
}