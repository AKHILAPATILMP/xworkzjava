package com.xworkz.dtype;

public class Human {
    Shirt shirt;

    Human(Shirt shirt) {
        this.shirt = shirt;
        System.out.println("shirt is running");
    }

    void sunprotection() {
        if (this.shirt != null) {
            this.shirt.fade();
            this.shirt.tear();
        } else {
            System.out.println("shirt is not running");
        }
    }
}