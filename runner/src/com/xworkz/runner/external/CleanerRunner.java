package com.xworkz.runner.external;

import com.xworkz.runner.internal.Cleaner;

public class CleanerRunner {
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner("Dyson", "Vacuum", 35000);
        System.out.println("cleaner" + cleaner.toString());
    }
}
