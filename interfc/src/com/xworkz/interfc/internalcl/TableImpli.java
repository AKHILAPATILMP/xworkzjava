package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Table;

public class TableImpli implements Table {
    @Override
    public void placeItems() {
        System.out.println("Items placed on table");
    }

    @Override
    public void cleanSurface() {
        System.out.println("Table surface cleaned");
    }

    @Override
    public void foldTable() {
        System.out.println("Table folded");
    }
}
