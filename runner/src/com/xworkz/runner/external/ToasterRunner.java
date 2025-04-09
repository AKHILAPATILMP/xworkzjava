package com.xworkz.runner.external;

import com.xworkz.runner.internal.Toaster;

public class ToasterRunner {
    public static void main(String[] args) {
        Toaster toaster = new Toaster("Prestige", 2, 1500);
        System.out.println("toaster" + toaster.toString());
    }
}
