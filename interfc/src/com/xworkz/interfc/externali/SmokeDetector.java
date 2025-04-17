package com.xworkz.interfc.externali;

public interface SmokeDetector {
    void detectSmoke();
    void soundAlarm();
    void testSystem();
    default public void smoke() {
        System.out.println("smoke");
    }
}
