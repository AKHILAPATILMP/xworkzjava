package com.xworkz.interfc.externali;

public interface FireExtinguisher {
    void releaseFoam();
    void extinguishFire();
    void inspectPressure();
    default void fireexit (){
        System.out.println("fire exit");
    }
}
