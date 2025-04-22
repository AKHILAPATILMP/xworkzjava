package com.xworkz.later.external;

import com.xworkz.later.internal.Filter;

public class FilterUser {

    Filter filter;

    public FilterUser(Filter filter) {
        this.filter = filter;
        System.out.println("FilterUser is initialized");
    }

    public void activate() {
        if (this.filter != null) {
            this.filter.applyFilter();
        } else {
            System.out.println("No filter to apply");
        }
    }
}
