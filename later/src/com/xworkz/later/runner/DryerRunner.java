package com.xworkz.later.runner;

import com.xworkz.later.internal.Dryer;
import com.xworkz.later.internal.DryerImpl;
import com.xworkz.later.external.DryerUser;

public class DryerRunner {
    public static void main(String[] args) {
        Dryer dryer = new DryerImpl();
        DryerUser dryerUser = new DryerUser(dryer); // abstraction
        dryerUser.activate();
    }
}
