package com.xworkz.runner.external;

import com.xworkz.runner.internal.River;

public class RiverRunner {

public static void main(String[] args) {
    River river = new River("Flowing body of water", "Life and journey", 8.7);
    System.out.println("river" + river.toString());
}
}
