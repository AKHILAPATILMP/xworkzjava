package com.xworkz.interfc.externali;

public interface PrinterScanner {
    void print();
    void scan();
    void copy();
    default void scnr() {
        System.out.println("scan the reading of content");
    }
}
