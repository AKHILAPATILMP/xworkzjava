package com.xworkz.interfc.externali;

public interface Chair {
    void sit();
    void adjustHeight();
    void rotate();
    default void pull(){
        System.out.println("pull the chair");
    }
}
