package com.xworkz.later.internal;

public class FilterImpl implements Filter {

    public FilterImpl() {
        super();
        System.out.println("FilterImpl constructor running");
    }

    @Override
    public void applyFilter() {
        System.out.println("Filter is being applied...");
    }
}
