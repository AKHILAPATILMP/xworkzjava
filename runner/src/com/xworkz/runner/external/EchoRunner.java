package com.xworkz.runner.external;

import com.xworkz.runner.internal.Echo;

public class EchoRunner {
    public static void main(String[] args) {
        Echo echo = new Echo("Voice", 0.75, "Canyon");
        String echoString = echo.toString();
        System.out.println("Echo details: " + echoString);

        int hash = echo.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "sound";
        String two = "reverb";
        String three = "reflection";

        System.out.println("sound: " + one.hashCode());
        System.out.println("reverb: " + two.hashCode());
        System.out.println("reflection: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(echo));
    }
}
