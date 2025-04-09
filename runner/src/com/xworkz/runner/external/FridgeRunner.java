package com.xworkz.runner.external;

import com.xworkz.runner.internal.Fridge;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("Samsung", 300, 28000);
        System.out.println("fridge" + fridge.toString());
    }
}
