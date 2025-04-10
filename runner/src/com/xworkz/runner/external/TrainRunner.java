package com.xworkz.runner.external;

import com.xworkz.runner.internal.Train;

public class TrainRunner {
    public static void main(String[] args) {
        Train train = new Train("Rajdhani Express", 18, 1599.75);
        String trainString = train.toString();
        System.out.println("Train details: " + trainString);

        int hash = train.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "track";
        String two = "station";
        String three = "speed";

        System.out.println("track: " + one.hashCode());
        System.out.println("station: " + two.hashCode());
        System.out.println("speed: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(train));
    }
}
