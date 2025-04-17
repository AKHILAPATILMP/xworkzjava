package com.xworkz.interfc.externali;

public interface Sofa {
    void sit();
    void recline();
    void unfoldBed();
    default void sofa() {
        System.out.println("sofa");
    }
}
