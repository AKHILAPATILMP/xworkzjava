package com.xworkz.runner.external;

import com.xworkz.runner.internal.Hope;

public class HopeRunner {
    public static void main(String[] args) {
        Hope hope = new Hope("Optimism for the future", "Light in darkness", 8.5);
        System.out.println("hope" + hope.toString());
    }
}
