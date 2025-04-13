package com.xworkz.equals.external;

import com.xworkz.equals.internal.Syringe;

public class SyringeRunner {
    public static void main(String[] args) {

        Syringe s1 = new Syringe();
        s1.setMaterial("Plastic");
        s1.setVolume(5.0);
        s1.setIsDisposable(true);
        s1.setNeedleType("Thin");

        Syringe s2 = new Syringe();
        s2.setMaterial("Plastic");
        s2.setVolume(5.0);
        s2.setIsDisposable(true);
        s2.setNeedleType("Thick");

        boolean same = s1.equals(s2);
        System.out.println("s1 equals s2: " + same);

        System.out.println("Syringe 1: " + s1);
        System.out.println("Syringe 2: " + s2);

        System.out.println("Syringe 1 hashCode: " + s1.hashCode());
        System.out.println("Syringe 2 hashCode: " + s2.hashCode());
    }
}
