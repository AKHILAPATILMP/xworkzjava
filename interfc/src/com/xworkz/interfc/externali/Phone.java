package com.xworkz.interfc.externali;

public interface Phone {
    void call();

    void text();

    void browse();

    default void scream() {
        System.out.println("scream");
    }
}