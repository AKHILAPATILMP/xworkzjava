package com.xworkz.later.runner;

import com.xworkz.later.internal.Filter;
import com.xworkz.later.internal.FilterImpl;
import com.xworkz.later.external.FilterUser;

public class FTRunner {
    public static void main(String[] args) {
        Filter filter = new FilterImpl();
        FilterUser filterUser = new FilterUser(filter); // abstraction
        filterUser.activate();
    }
}
