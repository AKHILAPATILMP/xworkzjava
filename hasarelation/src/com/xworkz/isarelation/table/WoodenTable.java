package com.xworkz.isarelation.table;
public class WoodenTable extends Table {

    public WoodenTable() {
        super();
        System.out.println("WoodenTable constructor is running - subclass");
    }

    @Override
    public void supportItems() {
        System.out.println("WoodenTable supports items sturdily - subclass");
    }

    @Override
    public void provideSurface() {
        System.out.println("WoodenTable has a polished wooden surface - subclass");
    }

    @Override
    public void fold() {
        System.out.println("WoodenTable is not foldable - subclass");
    }

    @Override
    public void clean() {
        System.out.println("WoodenTable is cleaned using wood polish - subclass");
    }
}

