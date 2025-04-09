package com.xworkz.runner.external;

import com.xworkz.runner.internal.Drawer;

public class DrawerRunner {
    public static void main(String[] args) {
        Drawer drawer = new Drawer("Wood", "White", 1800);
        System.out.println("drawer" + drawer.toString());
    }
}
