package com.xworkz.runner.external;

import com.xworkz.runner.internal.Shadow;

public class ShadowRunner {
    public static void main(String[] args) {
        Shadow shadow = new Shadow("A dark shape caused by light being blocked", "Hidden truth", 7.8);
        System.out.println("shadow" + shadow.toString());
    }
}
