package com.xworkz.later.runner;

import com.xworkz.later.internal.Appliance;
import com.xworkz.later.internal.ApplianceImpl;
import com.xworkz.later.external.ApplianceUser;

public class ARunner {
    public static void main(String[] args) {
        Appliance appliance = new ApplianceImpl();
        ApplianceUser applianceUser = new ApplianceUser(appliance); // abstraction
        applianceUser.activate();
    }
}
