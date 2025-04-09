package com.xworkz.runner.external;

import com.xworkz.runner.internal.Stand;

public class StandRunner {
    public static void main(String[] args) {
        Stand stand = new Stand("Metal", "Black", 900);
        System.out.println("stand" + stand.toString());
    }
}
