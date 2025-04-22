package com.xworkz.later.internal;

public class TelevisionImpl implements Television {

    public TelevisionImpl() {
        super();
        System.out.println("TelevisionImpl constructor running");
    }

    @Override
    public void display() {
        System.out.println("Television is displaying...");
    }
}
