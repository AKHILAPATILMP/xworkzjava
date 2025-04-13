package com.xworkz.equals.external;

import com.xworkz.equals.internal.Firewall;

public class FirewallRunner {
    public static void main(String[] args) {

        Firewall firewall1 = new Firewall();
        firewall1.setName("ZoneAlarm");
        firewall1.setType("Personal");
        firewall1.setVersion(10.1);

        Firewall firewall2 = new Firewall();
        firewall2.setName("ZoneAlarm");
        firewall2.setType("Enterprise");
        firewall2.setVersion(12.0);

        boolean same = firewall1.equals(firewall2);
        System.out.println("firewall1 equals firewall2: " + same);

        System.out.println("Firewall 1: " + firewall1);
        System.out.println("Firewall 2: " + firewall2);

        System.out.println("Firewall 1 hashCode: " + firewall1.hashCode());
        System.out.println("Firewall 2 hashCode: " + firewall2.hashCode());
    }
}
