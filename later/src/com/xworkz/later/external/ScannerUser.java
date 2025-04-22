package com.xworkz.later.external;

import com.xworkz.later.internal.Scanner;

public class ScannerUser {

    Scanner scanner;

    public ScannerUser(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("ScannerUser is initialized");
    }

    public void activate() {
        if (this.scanner != null) {
            this.scanner.scan();
        } else {
            System.out.println("No scanner to scan");
        }
    }
}
