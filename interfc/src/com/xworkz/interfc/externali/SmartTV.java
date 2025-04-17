package com.xworkz.interfc.externali;

public interface SmartTV {
    void streamContent();
    void adjustSettings();
    void castToTV();
    default void tv() {
        System.out.println("tv");
    }

}
