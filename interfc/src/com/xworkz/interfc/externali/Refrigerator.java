package com.xworkz.interfc.externali;

public interface Refrigerator {
    void cool();
    void freeze();
    void defrost();
    default void system() {
        System.out.println("system");
    }
}
