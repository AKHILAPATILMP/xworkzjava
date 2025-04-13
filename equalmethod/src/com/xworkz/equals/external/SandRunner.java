package com.xworkz.equals.external;
import com.xworkz.equals.internal.Sand;

public class SandRunner {
    public static void main(String[] args) {

        Sand sand1 = new Sand();
        sand1.setColor("Golden");
        sand1.setGrainSize(0.5);
        sand1.setLocation("Beach");
        sand1.setIsFine(true);

        Sand sand2 = new Sand();
        sand2.setColor("Golden");  // same color
        sand2.setGrainSize(1.0);
        sand2.setLocation("Desert");
        sand2.setIsFine(false);

        boolean same = sand1.equals(sand2);
        System.out.println("sand1 equals sand2: " + same);

        System.out.println("Sand 1: " + sand1);
        System.out.println("Sand 2: " + sand2);

        System.out.println("Sand 1 hashCode: " + sand1.hashCode());
        System.out.println("Sand 2 hashCode: " + sand2.hashCode());
    }
}


