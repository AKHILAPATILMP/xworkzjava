package com.xworkz.equals.external;

import com.xworkz.equals.internal.JetSpray;

public class JetSprayRunner {
    public static void main(String[] args) {

        JetSpray spray1 = new JetSpray();
        spray1.setBrand("SuperJet");
        spray1.setCapacity(500);
        spray1.setIsRechargeable(true);
        spray1.setSprayType("Mist");

        JetSpray spray2 = new JetSpray();
        spray2.setBrand("SuperJet");
        spray2.setCapacity(600);
        spray2.setIsRechargeable(false);
        spray2.setSprayType("Jet");

        boolean same = spray1.equals(spray2);
        System.out.println("spray1 equals spray2: " + same);

        System.out.println("JetSpray 1: " + spray1);
        System.out.println("JetSpray 2: " + spray2);

        System.out.println("JetSpray 1 hashCode: " + spray1.hashCode());
        System.out.println("JetSpray 2 hashCode: " + spray2.hashCode());
    }
}
