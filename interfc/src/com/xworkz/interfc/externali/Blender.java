package com.xworkz.interfc.externali;

public interface Blender {
    void blend();
    void chop();
    void pulse();
    default void rotate(){
        System.out.println("rotate");
    }
}
