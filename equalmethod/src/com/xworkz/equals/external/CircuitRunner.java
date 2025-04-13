package com.xworkz.equals.external;

import com.xworkz.equals.internal.Circuit;

public class CircuitRunner {
    public static void main(String[] args) {

        Circuit circuit1 = new Circuit();
        circuit1.setType("Integrated Circuit");
        circuit1.setNumberOfComponents(15);
        circuit1.setMaterial("Silicon");

        Circuit circuit2 = new Circuit();
        circuit2.setType("Integrated Circuit");
        circuit2.setNumberOfComponents(15);
        circuit2.setMaterial("Silicon");

        boolean same = circuit1.equals(circuit2);
        System.out.println("circuit1 equals circuit2: " + same);

        System.out.println("Circuit 1: " + circuit1);
        System.out.println("Circuit 2: " + circuit2);

        System.out.println("Circuit 1 hashCode: " + circuit1.hashCode());
        System.out.println("Circuit 2 hashCode: " + circuit2.hashCode());
    }
}
