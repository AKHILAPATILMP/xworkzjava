package com.xworkz.equals.external;

import com.xworkz.equals.internal.Workbench;

public class WorkbenchRunner {
    public static void main(String[] args) {

        Workbench workbench1 = new Workbench();
        workbench1.setMaterial("Wood");
        workbench1.setSize(5.0);
        workbench1.setHasDrawers(true);
        workbench1.setColor("Brown");

        Workbench workbench2 = new Workbench();
        workbench2.setMaterial("Wood");  // same material
        workbench2.setSize(5.0);         // same size
        workbench2.setHasDrawers(false);
        workbench2.setColor("Dark Brown");

        boolean same = workbench1.equals(workbench2);
        System.out.println("workbench1 equals workbench2: " + same);

        System.out.println("Workbench 1: " + workbench1);
        System.out.println("Workbench 2: " + workbench2);

        System.out.println("Workbench 1 hashCode: " + workbench1.hashCode());
        System.out.println("Workbench 2 hashCode: " + workbench2.hashCode());
    }
}
