package com.xworkz.runner.external;

import com.xworkz.runner.internal.Peace;

public class PeaceRunner {
    public static void main(String[] args) {
        Peace peace = new Peace("Calm and harmony", "Still water", 9.5);
        System.out.println("peace" + peace.toString());
    }
}
