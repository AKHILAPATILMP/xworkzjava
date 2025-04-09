package com.xworkz.runner.external;

import com.xworkz.runner.internal.Tvstand;

public class TvstandRunner {
    public static void main(String[] args) {
        Tvstand tvStand = new Tvstand("Glass", "Black", 2200);
        System.out.println("tvstand" + tvStand.toString());
    }
}
