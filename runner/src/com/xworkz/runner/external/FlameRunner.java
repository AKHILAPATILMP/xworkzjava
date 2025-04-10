package com.xworkz.runner.external;

import com.xworkz.runner.internal.Flame;

public class FlameRunner {
    public static void main(String[] args) {
        Flame flame = new Flame("Blue", 1500, "Gasoline");
        String flameString = flame.toString();
        System.out.println("Flame details: " + flameString);

        int hash = flame.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "burn";
        String two = "ignite";
        String three = "spark";

        System.out.println("burn: " + one.hashCode());
        System.out.println("ignite: " + two.hashCode());
        System.out.println("spark: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(flame));
    }
}
