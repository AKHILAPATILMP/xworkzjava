package com.xworkz.runner.external;

import com.xworkz.runner.internal.Tablet;

public class TabletRunner {
    public static void main(String[] args) {
        Tablet tablet = new Tablet("Apple", 11, 80000);
        String tabletString = tablet.toString();
        System.out.println("tablet" + tabletString);
    }
}
