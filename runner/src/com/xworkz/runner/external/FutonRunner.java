package com.xworkz.runner.external;

import com.xworkz.runner.internal.Futon;

public class FutonRunner {
    public static void main(String[] args) {
        Futon futon = new Futon("Wood", "Grey", 7000);
        System.out.println("futon" + futon.toString());
    }
}
