package com.xworkz.runner.external;

import com.xworkz.runner.internal.Star;

public class StarRunner {
    public static void main(String[] args) {
        Star star = new Star("Orion", 2.5, 1340);
        System.out.println("star" + star.toString());
    }
}
