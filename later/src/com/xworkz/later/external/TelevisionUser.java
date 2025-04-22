package com.xworkz.later.external;

import com.xworkz.later.internal.Television;

public class TelevisionUser {

    Television television;

    public TelevisionUser(Television television) {
        this.television = television;
        System.out.println("TelevisionUser is initialized");
    }

    public void activate() {
        if (this.television != null) {
            this.television.display();
        } else {
            System.out.println("No television to display");
        }
    }
}
