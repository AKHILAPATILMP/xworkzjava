package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bronze;

public class BronzeRunner {
    public static void main(String[] args) {
    Bronze bronze = new Bronze(88.0, 12.0, "Sculpture");
    System.out.println("bronze" + bronze.toString());
}
}
