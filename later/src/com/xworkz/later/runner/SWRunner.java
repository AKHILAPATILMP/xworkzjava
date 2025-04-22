package com.xworkz.later.runner;

import com.xworkz.later.internal.Switch;
import com.xworkz.later.internal.SwitchImpl;
import com.xworkz.later.external.SwitchUser;

public class SWRunner {
    public static void main(String[] args) {
        Switch switchRef = new SwitchImpl();
        SwitchUser switchUser = new SwitchUser(switchRef); // abstraction
        switchUser.press();
    }
}
