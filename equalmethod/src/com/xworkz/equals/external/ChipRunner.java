package com.xworkz.equals.external;

import com.xworkz.equals.internal.Chip;

public class ChipRunner {
    public static void main(String[] args) {

        Chip chip1 = new Chip();
        chip1.setType("Potato");
        chip1.setWeight(150);
        chip1.setBrand("Lays");
        chip1.setIsSalted(true);

        Chip chip2 = new Chip();
        chip2.setType("Potato");
        chip2.setWeight(150);
        chip2.setBrand("Lays");
        chip2.setIsSalted(false);

        boolean same = chip1.equals(chip2);
        System.out.println("chip1 equals chip2: " + same);

        System.out.println("Chip 1: " + chip1);
        System.out.println("Chip 2: " + chip2);

        System.out.println("Chip 1 hashCode: " + chip1.hashCode());
        System.out.println("Chip 2 hashCode: " + chip2.hashCode());
    }
}
