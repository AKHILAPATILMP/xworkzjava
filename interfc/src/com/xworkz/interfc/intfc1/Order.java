package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Printer;
import com.xworkz.interfc.externali.Refrigerator;

public class Order implements Printer, Refrigerator {
    @Override
    public void print() {
        System.out.println("");
    }

    @Override
    public void scan() {
        System.out.println("");
    }

    @Override
    public void copy() {
        System.out.println("");
    }

    @Override
    public void cool() {
        System.out.println("");
    }

    @Override
    public void freeze() {
        System.out.println("");
    }

    @Override
    public void defrost() {
        System.out.println("");
    }
}
