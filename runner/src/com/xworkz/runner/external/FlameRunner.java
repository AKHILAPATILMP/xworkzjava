package com.xworkz.runner.external;

import com.xworkz.runner.internal.Flame;

public class FlameRunner {

    public static void main(String[] args) {
        Flame flame = new Flame("A burning element of fire", "Passion and destruction", 9.1);
        System.out.println("flame" + flame.toString());
    }
}