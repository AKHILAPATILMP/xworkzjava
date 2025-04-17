package com.xworkz.interfc.externali;

public interface Printer {
    void print();

    void scan();

    void copy();

    default void read() {
        System.out.println("read");
    }
}