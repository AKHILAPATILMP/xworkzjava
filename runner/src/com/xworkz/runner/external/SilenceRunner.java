package com.xworkz.runner.external;

import com.xworkz.runner.internal.Silence;

public class SilenceRunner {
    public static void main(String[] args) {
        Silence silence = new Silence("Absence of sound", "Peace or tension", 8.4);
        System.out.println("silence" + silence.toString());
    }
}


