package com.xworkz.later.runner;

import com.xworkz.later.internal.Clock;
import com.xworkz.later.internal.ClockImpl;
import com.xworkz.later.external.ClockUser;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock = new ClockImpl();
        ClockUser clockUser = new ClockUser(clock); // abstraction
        clockUser.activate();
    }
}
