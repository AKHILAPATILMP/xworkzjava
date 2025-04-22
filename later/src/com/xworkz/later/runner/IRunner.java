package com.xworkz.later.runner;

import com.xworkz.later.internal.Instrument;
import com.xworkz.later.internal.InstrumentImpl;
import com.xworkz.later.external.InstrumentUser;

public class IRunner {
    public static void main(String[] args) {
        Instrument instrument = new InstrumentImpl();
        InstrumentUser instrumentUser = new InstrumentUser(instrument); // abstraction
        instrumentUser.perform();
    }
}
