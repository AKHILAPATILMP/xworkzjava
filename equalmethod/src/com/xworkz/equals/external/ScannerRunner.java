package com.xworkz.equals.external;

import com.xworkz.equals.internal.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner();
        scanner1.setModelName("HP ScanJet");
        scanner1.setType("Flatbed");
        scanner1.setPrice(149.99);

        Scanner scanner2 = new Scanner();
        scanner2.setModelName("HP ScanJet");
        scanner2.setType("Sheetfed");
        scanner2.setPrice(179.99);

        boolean same = scanner1.equals(scanner2);
        System.out.println("scanner1 equals scanner2: " + same);

        System.out.println("Scanner 1: " + scanner1);
        System.out.println("Scanner 2: " + scanner2);

        System.out.println("Scanner 1 hashCode: " + scanner1.hashCode());
        System.out.println("Scanner 2 hashCode: " + scanner2.hashCode());
    }
}
