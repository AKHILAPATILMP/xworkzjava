package com.xworkz.runner.external;

import com.xworkz.runner.internal.Headphone;

public class HeadphoneRunner {
    public static void main(String[] args) {
        Headphone headphone = new Headphone("Boat", "Wireless", 1799);
        String headphoneString = headphone.toString();
        System.out.println("headphone" + headphoneString);
    }
}
