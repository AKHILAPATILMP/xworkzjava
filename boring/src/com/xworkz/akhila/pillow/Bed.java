package com.xworkz.akhila.pillow;

public class Bed {
    void place(Pillow pillow) {
        if (pillow != null) {
            pillow.rest();
        } else {
            System.out.println("No pillow is placed on the bed");
        }
    }
}
