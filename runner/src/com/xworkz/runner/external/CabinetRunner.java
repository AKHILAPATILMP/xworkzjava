package com.xworkz.runner.external;

import com.xworkz.runner.internal.Cabinet;

public class CabinetRunner {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("Metal", "Grey", 4000);
        System.out.println("cabinet" + cabinet.toString());
    }
}
