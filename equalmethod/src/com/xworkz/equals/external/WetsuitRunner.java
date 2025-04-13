package com.xworkz.equals.external;

import com.xworkz.equals.internal.Wetsuit;

public class WetsuitRunner {
    public static void main(String[] args) {

        Wetsuit wetsuit1 = new Wetsuit();
        wetsuit1.setMaterial("Neoprene");
        wetsuit1.setThickness(5.0);  // thickness in mm
        wetsuit1.setSize("Medium");
        wetsuit1.setIsShortSleeve(true);

        Wetsuit wetsuit2 = new Wetsuit();
        wetsuit2.setMaterial("Neoprene");  // same material
        wetsuit2.setThickness(4.5);  // different thickness
        wetsuit2.setSize("Medium");  // same size
        wetsuit2.setIsShortSleeve(false);  // different sleeve type

        boolean same = wetsuit1.equals(wetsuit2);
        System.out.println("wetsuit1 equals wetsuit2: " + same);

        System.out.println("Wetsuit 1: " + wetsuit1);
        System.out.println("Wetsuit 2: " + wetsuit2);

        System.out.println("Wetsuit 1 hashCode: " + wetsuit1.hashCode());
        System.out.println("Wetsuit 2 hashCode: " + wetsuit2.hashCode());
    }
}
