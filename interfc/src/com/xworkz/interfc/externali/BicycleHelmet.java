package com.xworkz.interfc.externali;

public interface BicycleHelmet {
    void protectHead();
    void adjustStrap();
    void remove();
    default void tanprotect(){
            System.out.println("tan protection");
        }
    }

