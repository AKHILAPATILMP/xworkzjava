package com.xworkz.runner.external;

import com.xworkz.runner.internal.Rhythm;

public class RhythmRunner {public static void main(String[] args) {
    Rhythm rhythm = new Rhythm("3/4 Waltz", 90, false);
    System.out.println("rhythm" + rhythm.toString());
}
}
