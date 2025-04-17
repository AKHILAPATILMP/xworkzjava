package com.xworkz.interfc.externali;

public interface Fridge {
    void cool();
    void defrost();
    void setTemperature();
    default void close(){
        System.out.println("close the fridge");
    }
}
