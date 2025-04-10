package com.xworkz.runner.external;

import com.xworkz.runner.internal.Toaster;

public class ToasterRunner {
    public static void main(String[] args) {
        Toaster toaster = new Toaster(2, "Philips", 1299.99);
        String toasterString = toaster.toString();
        System.out.println("Toaster details: " + toasterString);

        int hash = toaster.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "heat";
        String two = "bread";
        String three = "toast";

        System.out.println("heat: " + one.hashCode());
        System.out.println("bread: " + two.hashCode());
        System.out.println("toast: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(toaster));
    }
}
