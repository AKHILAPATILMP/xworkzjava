package com.xworkz.runner.external;

import com.xworkz.runner.internal.Echo;

public class EchoRunner {
    public static void main(String[] args) {
        Echo echo = new Echo("Repetition of sound", "Memory and reflection", 8.0);
        System.out.println("echo" + echo.toString());
    }
}
