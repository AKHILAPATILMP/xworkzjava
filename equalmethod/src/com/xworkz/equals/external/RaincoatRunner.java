package com.xworkz.equals.external;

import com.xworkz.equals.internal.Raincoat;

public class RaincoatRunner {
    public static void main(String[] args) {

        Raincoat raincoat1 = new Raincoat();
        raincoat1.setColor("Yellow");

        Raincoat raincoat2 = new Raincoat();
        raincoat2.setColor("Yellow");

        boolean same = raincoat1.equals(raincoat2);
        System.out.println("raincoat1 equals raincoat2: " + same);

        System.out.println("Raincoat 1: " + raincoat1);
        System.out.println("Raincoat 2: " + raincoat2);

        System.out.println("Raincoat 1 hashCode: " + raincoat1.hashCode());
        System.out.println("Raincoat 2 hashCode: " + raincoat2.hashCode());
    }
}
