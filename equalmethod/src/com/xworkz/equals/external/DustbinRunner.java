package com.xworkz.equals.external;

import com.xworkz.equals.internal.Dustbin;

public class DustbinRunner {
    public static void main(String[] args) {

        Dustbin dustbin1 = new Dustbin();
        dustbin1.setType("Plastic");
        dustbin1.setCapacity(50);
        dustbin1.setColor("Green");

        Dustbin dustbin2 = new Dustbin();
        dustbin2.setType("Plastic");
        dustbin2.setCapacity(50);
        dustbin2.setColor("Green");

        boolean same = dustbin1.equals(dustbin2);
        System.out.println("dustbin1 equals dustbin2: " + same);

        System.out.println("Dustbin 1: " + dustbin1);
        System.out.println("Dustbin 2: " + dustbin2);

        System.out.println("Dustbin 1 hashCode: " + dustbin1.hashCode());
        System.out.println("Dustbin 2 hashCode: " + dustbin2.hashCode());
    }
}
