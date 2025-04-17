package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Sofa;
import com.xworkz.interfc.externali.Table;

public class Room implements Sofa, Table {
    @Override
    public void sit() {
        System.out.println("");
    }

    @Override
    public void recline() {
        System.out.println("");
    }

    @Override
    public void unfoldBed() {
        System.out.println("");
    }

    @Override
    public void placeItems() {
        System.out.println("");
    }

    @Override
    public void cleanSurface() {
        System.out.println("");
    }

    @Override
    public void foldTable() {
        System.out.println("");
    }
}
