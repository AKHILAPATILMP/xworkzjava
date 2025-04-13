package com.xworkz.equals.external;

import com.xworkz.equals.internal.Screen;

public class ScreenRunner {
    public static void main(String[] args) {

        Screen s1 = new Screen();
        s1.setResolution("1920x1080");
        s1.setSize(15.6);
        s1.setType("LED");
        s1.setIsTouch(false);

        Screen s2 = new Screen();
        s2.setResolution("1920x1080");
        s2.setSize(15.6);
        s2.setType("OLED");
        s2.setIsTouch(true);

        boolean same = s1.equals(s2);
        System.out.println("s1 equals s2: " + same);

        System.out.println("Screen 1: " + s1);
        System.out.println("Screen 2: " + s2);

        System.out.println("Screen 1 hashCode: " + s1.hashCode());
        System.out.println("Screen 2 hashCode: " + s2.hashCode());
    }
}
