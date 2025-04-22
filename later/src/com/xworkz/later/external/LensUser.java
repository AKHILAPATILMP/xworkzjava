package com.xworkz.later.external;

import com.xworkz.later.internal.Lens;

public class LensUser {

    Lens lens;

    public LensUser(Lens lens) {
        this.lens = lens;
        System.out.println("LensUser is initialized");
    }

    public void activate() {
        if (this.lens != null) {
            this.lens.focus();
        } else {
            System.out.println("No lens to focus");
        }
    }
}
