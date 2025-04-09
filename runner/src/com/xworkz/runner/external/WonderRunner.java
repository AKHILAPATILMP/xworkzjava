package com.xworkz.runner.external;

import com.xworkz.runner.internal.Wonder;

public class WonderRunner {
    public static void main(String[] args) {
        Wonder wonder = new Wonder("A feeling of amazement", "Curiosity and awe", 9.3);
        System.out.println("wonder" + wonder.toString());
    }
}
