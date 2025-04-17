package com.xworkz.interfc.externali;

public interface Router {
    void connect();
    void disconnect();
    void reset();
    default void route() {
        System.out.println("router");
    }
}
