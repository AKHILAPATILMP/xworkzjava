package com.xworkz.interfc.externali;

public interface Table {
    void placeItems();
    void cleanSurface();
    void foldTable();
    default void onthetable() {
        System.out.println("on the table");
    }
}
