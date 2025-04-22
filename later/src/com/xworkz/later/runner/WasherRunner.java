package com.xworkz.later.runner;

import com.xworkz.later.internal.Washer;
import com.xworkz.later.internal.WasherImpl;
import com.xworkz.later.external.WasherUser;

public class WasherRunner {
    public static void main(String[] args) {
        Washer washer = new WasherImpl();
        WasherUser washerUser = new WasherUser(washer); // abstraction
        washerUser.activate();
    }
}
