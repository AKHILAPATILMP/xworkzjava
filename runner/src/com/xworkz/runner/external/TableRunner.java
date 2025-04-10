package com.xworkz.runner.external;

import com.xworkz.runner.internal.Table;

public class TableRunner {
    public static void main(String[] args) {
        Table table = new Table("Wood", "Rectangle", 4);
        String tableString = table.toString();
        System.out.println("Table details: " + tableString);

        int hash = table.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "surface";
        String two = "corner";
        String three = "edge";

        System.out.println("surface: " + one.hashCode());
        System.out.println("corner: " + two.hashCode());
        System.out.println("edge: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(table));
    }
}
