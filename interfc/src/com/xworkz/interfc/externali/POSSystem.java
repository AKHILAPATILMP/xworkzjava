package com.xworkz.interfc.externali;

public interface POSSystem {
    void processPayment();

    void generateReceipt();

    void trackInventory();

    default void sys() {
        System.out.println("sys");
    }
}