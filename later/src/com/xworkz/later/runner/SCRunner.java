package com.xworkz.later.runner;

import com.xworkz.later.internal.Scanner;
import com.xworkz.later.internal.ScannerImpl;
import com.xworkz.later.external.ScannerUser;

public class SCRunner {
    public static void main(String[] args) {
        Scanner scanner = new ScannerImpl();
        ScannerUser scannerUser = new ScannerUser(scanner); // abstraction
        scannerUser.activate();
    }
}
