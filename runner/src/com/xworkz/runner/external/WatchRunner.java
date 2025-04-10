package com.xworkz.runner.external;

import com.xworkz.runner.internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("Titan", "Analog", 2999.99);
        System.out.println("Watch details: " + watch.toString());

        int hash = watch.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("clock: " + "clock".hashCode());
        System.out.println("time: " + "time".hashCode());
        System.out.println("tick: " + "tick".hashCode());

        System.out.println("Original: " + System.identityHashCode(watch));
    }
}
