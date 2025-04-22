package com.xworkz.later.external;

import com.xworkz.later.internal.Constitution;

public class Government {

    Constitution constitution;

    public Government(Constitution constitution) {
        this.constitution = constitution;
        System.out.println("Government is governed by the Constitution");
    }

    public void ensureLawCompliance() {
        if (this.constitution != null) {
            this.constitution.followLaws();
        } else {
            System.out.println("No Constitution reference available");
        }
    }
}
