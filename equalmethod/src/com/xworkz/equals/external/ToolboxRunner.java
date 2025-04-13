package com.xworkz.equals.external;

import com.xworkz.equals.internal.Toolbox;

public class ToolboxRunner {
    public static void main(String[] args) {

        Toolbox toolbox1 = new Toolbox();
        toolbox1.setMaterial("Metal");
        toolbox1.setCapacity(30);
        toolbox1.setColor("Red");

        Toolbox toolbox2 = new Toolbox();
        toolbox2.setMaterial("Metal");
        toolbox2.setCapacity(30);
        toolbox2.setColor("Red");

        boolean same = toolbox1.equals(toolbox2);
        System.out.println("toolbox1 equals toolbox2: " + same);

        System.out.println("Toolbox 1: " + toolbox1);
        System.out.println("Toolbox 2: " + toolbox2);

        System.out.println("Toolbox 1 hashCode: " + toolbox1.hashCode());
        System.out.println("Toolbox 2 hashCode: " + toolbox2.hashCode());
    }
}
