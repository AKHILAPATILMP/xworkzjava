package com.xworkz.equals.external;

import com.xworkz.equals.internal.Tornado;

public class TornadoRunner {
    public static void main(String[] args) {

        Tornado t1 = new Tornado();
        t1.setName("Cyclone X");
        t1.setWindSpeed(120.0);
        t1.setOrigin("Ocean");
        t1.setIsSevere(true);

        Tornado t2 = new Tornado();
        t2.setName("Storm Z");
        t2.setWindSpeed(120.0); // same wind speed
        t2.setOrigin("Coastal");
        t2.setIsSevere(false);

        boolean same = t1.equals(t2);
        System.out.println("t1 equals t2: " + same);

        System.out.println("Tornado 1: " + t1);
        System.out.println("Tornado 2: " + t2);

        System.out.println("Tornado 1 hashCode: " + t1.hashCode());
        System.out.println("Tornado 2 hashCode: " + t2.hashCode());
    }
}
