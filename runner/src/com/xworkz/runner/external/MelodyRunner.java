package com.xworkz.runner.external;

import com.xworkz.runner.internal.Melody;

public class MelodyRunner {public static void main(String[] args) {
    Melody melody = new Melody("C Major", "Joyful", 16);
    System.out.println("melody" + melody.toString());
}
}
