package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.BlackoutCurtain;

public class Run7 {
    public static void main(String[] args) {
        BlackoutCurtain blackoutCurtain = new BlackoutCurtain();
        blackoutCurtain.blockLight();  // Inherited method from Curtain class
        blackoutCurtain.blockNoise();  // Method of BlackoutCurtain class
    }
}
