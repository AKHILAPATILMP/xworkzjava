package com.xworkz.runner.external;

import com.xworkz.runner.internal.Decay;

public class DecayRunner { public static void main(String[] args) {
    Decay decay = new Decay("Wood", 0.75, 3);
    System.out.println("decay" + decay.toString());
}
}
