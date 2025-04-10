package com.xworkz.runner.external;

import com.xworkz.runner.internal.Drawer;

public class DrawerRunner {
    public static void main(String[] args) {
        Drawer drawer = new Drawer("Wood", 4, true);
        String drawerString = drawer.toString();
        System.out.println("Drawer details: " + drawerString);

        int hash = drawer.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "cabinet";
        String two = "storage";
        String three = "compartment";

        System.out.println("cabinet: " + one.hashCode());
        System.out.println("storage: " + two.hashCode());
        System.out.println("compartment: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(drawer));
    }
}
