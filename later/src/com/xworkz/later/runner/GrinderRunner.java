package com.xworkz.later.runner;

import com.xworkz.later.internal.Grinder;
import com.xworkz.later.internal.GrinderImpl;
import com.xworkz.later.external.GrinderUser;

public class GrinderRunner {
    public static void main(String[] args) {
        Grinder grinder = new GrinderImpl();
        GrinderUser grinderUser = new GrinderUser(grinder); // abstraction
        grinderUser.activate();
    }
}
