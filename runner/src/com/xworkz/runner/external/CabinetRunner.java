package com.xworkz.runner.external;

import com.xworkz.runner.internal.Cabinet;

public class CabinetRunner {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("Wood", 4, 5.5);
        String cabinetString = cabinet.toString();
        System.out.println("Cabinet details: " + cabinetString);

        int hash = cabinet.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "drawer";
        String two = "storage";
        String three = "organizer";

        System.out.println("drawer: " + one.hashCode());
        System.out.println("storage: " + two.hashCode());
        System.out.println("organizer: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(cabinet));
    }
}
