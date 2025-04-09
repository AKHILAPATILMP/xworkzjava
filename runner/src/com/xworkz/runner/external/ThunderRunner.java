package com.xworkz.runner.external;

import com.xworkz.runner.internal.Thunder;

public class ThunderRunner {
    public static void main(String[] args) {
        Thunder thunder = new Thunder("A loud rumble during storms", "Power and warning", 9.3);
        System.out.println("thunder" + thunder.toString());
    }
}
