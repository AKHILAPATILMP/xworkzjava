package com.xworkz.runner.external;

import com.xworkz.runner.internal.Wardrobe;

public class WardrobeRunner {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(3, "Plywood", true);
        System.out.println("Wardrobe details: " + wardrobe.toString());

        int hash = wardrobe.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("closet: " + "closet".hashCode());
        System.out.println("organize: " + "organize".hashCode());
        System.out.println("mirror: " + "mirror".hashCode());

        System.out.println("Original: " + System.identityHashCode(wardrobe));
    }
}
