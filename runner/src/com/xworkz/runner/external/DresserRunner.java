package com.xworkz.runner.external;

import com.xworkz.runner.internal.Dresser;

public class DresserRunner {
    public static void main(String[] args) {
        Dresser dresser = new Dresser("Wood", "Beige", 4800);
        System.out.println("dresser" + dresser.toString());
    }
}
