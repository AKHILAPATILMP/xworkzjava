package com.xworkz.later.external;

import com.xworkz.later.internal.Icc;

public class Bcci {

    Icc icc;

    public Bcci(Icc icc) {
        this.icc = icc;
        System.out.println("BCCI is associated with ICC");
    }

    public void ensureFairPlay() {
        if (this.icc != null) {
            this.icc.fairPlay();
        } else {
            System.out.println("No ICC reference available");
        }
    }
}
