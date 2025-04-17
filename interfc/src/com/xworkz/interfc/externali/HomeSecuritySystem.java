package com.xworkz.interfc.externali;

public interface HomeSecuritySystem {
    void armSystem();
    void disarmSystem();
    void alertIntrusion();
    default void home (){
        System.out.println("home security");
    }
}
