package com.xworkz.akhila.dolo;

public class Pharmacy {
    void sell(Dolo650 dolo650) {
        if (dolo650 != null) {
            dolo650.consume();
        } else {
            System.out.println("Dolo650 is out of stock");
        }
    }
}
