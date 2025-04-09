package com.xworkz.runner.external;

import com.xworkz.runner.internal.Forest;

public class ForestRunner {
    public static void main(String[] args) {
        Forest forest = new Forest("A dense area of trees", "Mystery and life", 8.9);
        System.out.println("forest" + forest.toString());
    }

}
