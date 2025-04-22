package com.xworkz.later.runner;

import com.xworkz.later.internal.Microwave;
import com.xworkz.later.internal.MicrowaveImpl;
import com.xworkz.later.external.MicrowaveUser;

public class MicroRunner {
    public static void main(String[] args) {
        Microwave microwave = new MicrowaveImpl();
        MicrowaveUser microwaveUser = new MicrowaveUser(microwave); // abstraction
        microwaveUser.activate();
    }
}
