package com.xworkz.later.external;

import com.xworkz.later.internal.Instrument;

public class InstrumentUser {

    Instrument instrument;

    public InstrumentUser(Instrument instrument) {
        this.instrument = instrument;
        System.out.println("InstrumentUser is initialized");
    }

    public void perform() {
        if (this.instrument != null) {
            this.instrument.play();
        } else {
            System.out.println("No instrument to play");
        }
    }
}
