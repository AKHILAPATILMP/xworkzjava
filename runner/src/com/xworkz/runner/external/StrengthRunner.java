package com.xworkz.runner.external;

import com.xworkz.runner.internal.Strength;

public class StrengthRunner {public static void main(String[] args) {
    Strength strength = new Strength("Lifting 100kg", "Persistence", 92);
    System.out.println("strength" + strength.toString());
}
}
