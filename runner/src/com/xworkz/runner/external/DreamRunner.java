package com.xworkz.runner.external;

import com.xworkz.runner.internal.Dream;

public class DreamRunner {
    public static void main(String[] args) {
        Dream dream = new Dream("Vision during sleep or goal", "Infinite possibilities", 9.0);
        System.out.println("dream" + dream.toString());
    }
}
