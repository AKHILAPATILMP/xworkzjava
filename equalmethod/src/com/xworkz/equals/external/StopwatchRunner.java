package com.xworkz.equals.external;

import com.xworkz.equals.internal.Stopwatch;

public class StopwatchRunner {
    public static void main(String[] args) {

        Stopwatch stopwatch1 = new Stopwatch();
        stopwatch1.setBrand("Casio");
        stopwatch1.setTime(120.5); // 120.5 seconds
        stopwatch1.setColor("Black");

        Stopwatch stopwatch2 = new Stopwatch();
        stopwatch2.setBrand("Casio");
        stopwatch2.setTime(120.5);  // same time
        stopwatch2.setColor("Black");

        boolean same = stopwatch1.equals(stopwatch2);
        System.out.println("stopwatch1 equals stopwatch2: " + same);

        System.out.println("Stopwatch 1: " + stopwatch1);
        System.out.println("Stopwatch 2: " + stopwatch2);

        System.out.println("Stopwatch 1 hashCode: " + stopwatch1.hashCode());
        System.out.println("Stopwatch 2 hashCode: " + stopwatch2.hashCode());
    }
}
