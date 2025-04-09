package com.xworkz.runner.external;

import com.xworkz.runner.internal.Train;

public class TrainRunner {
    public static void main(String[] args) {
        Train train = new Train("Shatabdi Express", 18, 1500);
        String trainString = train.toString();
        System.out.println("train" + trainString);
    }
}
