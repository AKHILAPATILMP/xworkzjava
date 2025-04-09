package com.xworkz.runner.external;

import com.xworkz.runner.internal.Moon;

public class MoonRunner {public static void main(String[] args) {
    Moon moon = new Moon("Waning Crescent", true, -153.4);
    System.out.println("moon" + moon.toString());
}
}
