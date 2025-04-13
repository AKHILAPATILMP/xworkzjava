package com.xworkz.equals.external;

import com.xworkz.equals.internal.Gasoline;

public class GasolineRunner {
    public static void main(String[] args) {

        Gasoline gasoline1 = new Gasoline();
        gasoline1.setType("Premium");
        gasoline1.setOctaneLevel(91);
        gasoline1.setOrigin("USA");

        Gasoline gasoline2 = new Gasoline();
        gasoline2.setType("Premium");
        gasoline2.setOctaneLevel(91);
        gasoline2.setOrigin("USA");

        boolean same = gasoline1.equals(gasoline2);
        System.out.println("gasoline1 equals gasoline2: " + same);

        System.out.println("Gasoline 1: " + gasoline1);
        System.out.println("Gasoline 2: " + gasoline2);

        System.out.println("Gasoline 1 hashCode: " + gasoline1.hashCode());
        System.out.println("Gasoline 2 hashCode: " + gasoline2.hashCode());
    }
}
