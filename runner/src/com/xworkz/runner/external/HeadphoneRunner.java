package com.xworkz.runner.external;

import com.xworkz.runner.internal.Headphone;

public class HeadphoneRunner {
    public static void main(String[] args) {
        Headphone headphone = new Headphone("Sony", "Over-Ear", 2999.99);
        String headphoneString = headphone.toString();
        System.out.println("Headphone details: " + headphoneString);

        int hash = headphone.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "audio";
        String two = "music";
        String three = "sound";

        System.out.println("audio: " + one.hashCode());
        System.out.println("music: " + two.hashCode());
        System.out.println("sound: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(headphone));
    }
}
