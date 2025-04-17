package com.xworkz.interfc.externali;

public interface AC {
    void cool();
    void heat();
    void adjustTemperature();
    default void energySaverMode() {
        System.out.println("AC is in energy saver mode (default method).");
    }
}
