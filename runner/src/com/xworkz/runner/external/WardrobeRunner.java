package com.xworkz.runner.external;

import com.xworkz.runner.internal.Wardrobe;

public class WardrobeRunner {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe("Plywood", "Walnut", 7500);
        System.out.println("wardrobe" + wardrobe.toString());
    }
}
