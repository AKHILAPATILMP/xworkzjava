package com.xworkz.runner.external;

import com.xworkz.runner.internal.Tablet;

public class TabletRunner {
    public static void main(String[] args) {
        Tablet tablet = new Tablet("Samsung", 10.4, true);
        String tabletString = tablet.toString();
        System.out.println("Tablet details: " + tabletString);

        int hash = tablet.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "touch";
        String two = "pen";
        String three = "battery";

        System.out.println("touch: " + one.hashCode());
        System.out.println("pen: " + two.hashCode());
        System.out.println("battery: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(tablet));
    }
}
