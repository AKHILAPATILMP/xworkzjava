package com.xworkz.interfc.externali;

public interface Curtain {
    void open();
    void close();
    void wash();
    default void remove(){
        System.out.println("remove");
    }

    void operate();
}
