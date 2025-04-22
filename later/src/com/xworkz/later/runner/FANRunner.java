package com.xworkz.later.runner;

import com.xworkz.later.internal.Fan;
import com.xworkz.later.internal.FanImpl;
import com.xworkz.later.external.FanUser;

public class FANRunner {
    public static void main(String[] args) {
        Fan fan = new FanImpl();
        FanUser fanUser = new FanUser(fan); // abstraction
        fanUser.activate();
    }
}
