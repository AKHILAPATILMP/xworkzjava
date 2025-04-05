package com.xworkz.isarelation.table;
public class Table {

    public Table() {
        System.out.println("Table constructor is running - parent class");
    }

    public void supportItems() {
        System.out.println("Table supports items - parent class");
    }

    public void provideSurface() {
        System.out.println("Table provides a flat surface - parent class");
    }

    public void fold() {
        System.out.println("Table is foldable - parent class");
    }

    public void clean() {
        System.out.println("Table is being cleaned - parent class");
    }
}
