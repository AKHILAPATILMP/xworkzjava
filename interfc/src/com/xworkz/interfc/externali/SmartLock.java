package com.xworkz.interfc.externali;

public interface SmartLock {
    void lock();
    void unlock();
    void autoLock();
    default void lock1() {
        System.out.println("lock1");
    }
}
