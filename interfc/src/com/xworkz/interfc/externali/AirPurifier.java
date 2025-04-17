package com.xworkz.interfc.externali;

public interface AirPurifier {
    void purify();
    void replaceFilter();
    void adjustSpeed();
    default void clean(){
        System.out.println("clean the filter");
    }
}
