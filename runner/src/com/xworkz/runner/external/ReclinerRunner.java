package com.xworkz.runner.external;

import com.xworkz.runner.internal.Recliner;

public class ReclinerRunner {
    public static void main(String[] args) {
        Recliner recliner = new Recliner("Leather", "Brown", 12000);
        System.out.println("recliner" + recliner.toString());
    }
}
