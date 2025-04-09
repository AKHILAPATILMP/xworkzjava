package com.xworkz.runner.external;

import com.xworkz.runner.internal.Desk;

public class DeskRunner {
    public static void main(String[] args) {
        Desk desk = new Desk("Wood", "Oak", 3000);
        System.out.println("desk" + desk.toString());
    }
}
