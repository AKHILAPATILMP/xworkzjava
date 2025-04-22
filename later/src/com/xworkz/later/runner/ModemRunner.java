package com.xworkz.later.runner;

import com.xworkz.later.internal.Modem;
import com.xworkz.later.internal.ModemImpl;
import com.xworkz.later.external.ModemUser;

public class ModemRunner {
    public static void main(String[] args) {
        Modem modem = new ModemImpl();
        ModemUser modemUser = new ModemUser(modem); // abstraction
        modemUser.activate();
    }
}
