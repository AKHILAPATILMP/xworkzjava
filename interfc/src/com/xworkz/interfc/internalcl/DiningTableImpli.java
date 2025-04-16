package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Table;

public class DiningTableImpli implements Table {

    @Override
    public void placeItems() {
        System.out.println("Items placed on dining table");
    }

    @Override
    public void cleanSurface() {
        System.out.println("Dining table surface cleaned");
    }

    @Override
    public void foldTable() {
        System.out.println("Dining table folded");
    }
}
