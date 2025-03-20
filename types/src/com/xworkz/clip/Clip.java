package com.xworkz.clip;

public class Clip {
    String color;

    Clip(String color) {
        this.color = color;
    }

    void hold() {
        System.out.println(color + " clip is running.");
    }

    }

