package com.xworkz.runner.external;

import com.xworkz.runner.internal.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box box = new Box("Plastic", "Medium", 120);
        System.out.println("box" + box.toString());
    }
}
