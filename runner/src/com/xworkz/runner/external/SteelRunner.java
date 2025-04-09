package com.xworkz.runner.external;

import com.xworkz.runner.internal.Steel;

public class SteelRunner {public static void main(String[] args) {
    Steel steel = new Steel("A36", 400, 0.25);
    System.out.println("steel" + steel.toString());
}
}
