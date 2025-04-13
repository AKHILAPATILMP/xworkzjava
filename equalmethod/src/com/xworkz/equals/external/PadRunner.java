package com.xworkz.equals.external;

import com.xworkz.equals.internal.Pad;

public class PadRunner {
    public static void main(String[] args) {

        Pad pad1 = new Pad();
        pad1.setBrand("Wacom");
        pad1.setSize(10.5);
        pad1.setIsRechargeable(true);

        Pad pad2 = new Pad();
        pad2.setBrand("Wacom");
        pad2.setSize(10.5);
        pad2.setIsRechargeable(true);

        boolean same = pad1.equals(pad2);
        System.out.println("pad1 equals pad2: " + same);

        System.out.println("Pad 1: " + pad1);
        System.out.println("Pad 2: " + pad2);

        System.out.println("Pad 1 hashCode: " + pad1.hashCode());
        System.out.println("Pad 2 hashCode: " + pad2.hashCode());
    }
}
