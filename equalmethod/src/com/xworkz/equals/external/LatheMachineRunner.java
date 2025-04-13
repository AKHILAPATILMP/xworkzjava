package com.xworkz.equals.external;

import com.xworkz.equals.internal.LatheMachine;

public class LatheMachineRunner {
    public static void main(String[] args) {

        LatheMachine lathe1 = new LatheMachine();
        lathe1.setModel("XW-100");
        lathe1.setPower(5.5);
        lathe1.setManufacturer("Machinex");
        lathe1.setYear(2020);

        LatheMachine lathe2 = new LatheMachine();
        lathe2.setModel("XW-100"); // same model
        lathe2.setPower(7.2);
        lathe2.setManufacturer("ToolWorks");
        lathe2.setYear(2023);

        boolean same = lathe1.equals(lathe2);
        System.out.println("lathe1 equals lathe2: " + same);

        System.out.println("Lathe 1: " + lathe1);
        System.out.println("Lathe 2: " + lathe2);

        System.out.println("Lathe 1 hashCode: " + lathe1.hashCode());
        System.out.println("Lathe 2 hashCode: " + lathe2.hashCode());
    }
}
