package com.xworkz.equals.external;

import com.xworkz.equals.internal.Rain;

public class RainRunner {
    public static void main(String[] args) {

        Rain rain1 = new Rain();
        rain1.setSeason("Monsoon");
        rain1.setIntensity(80.5);
        rain1.setRegion("Coastal");
        rain1.setIsContinuous(true);

        Rain rain2 = new Rain();
        rain2.setSeason("Winter");
        rain2.setIntensity(80.5); // Same intensity
        rain2.setRegion("Mountain");
        rain2.setIsContinuous(false);

        boolean same = rain1.equals(rain2);
        System.out.println("rain1 equals rain2: " + same);

        System.out.println("Rain 1: " + rain1);
        System.out.println("Rain 2: " + rain2);

        System.out.println("Rain 1 hashCode: " + rain1.hashCode());
        System.out.println("Rain 2 hashCode: " + rain2.hashCode());
    }
}
