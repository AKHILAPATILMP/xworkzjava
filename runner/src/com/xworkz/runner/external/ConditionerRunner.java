package com.xworkz.runner.external;

import com.xworkz.runner.internal.Conditioner;

public class ConditionerRunner {
    public static void main(String[] args) {
        Conditioner conditioner = new Conditioner("Dove", "Hair", 350);
        System.out.println("conditioner" + conditioner.toString());
    }
}
