package com.xworkz.runner.external;

import com.xworkz.runner.internal.Stone;

public class StoneRunner {  public static void main(String[] args) {
    Stone stone = new Stone("Granite", 15.5, "Himalayas");
    System.out.println("stone" + stone.toString());
}
}
