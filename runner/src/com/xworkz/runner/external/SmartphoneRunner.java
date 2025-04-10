package com.xworkz.runner.external;

import com.xworkz.runner.internal.Smartphone;

public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S21", 69999.0);
        String phoneString = phone.toString();
        System.out.println("Smartphone details: " + phoneString);

        int hash = phone.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "mobile";
        String two = "touch";
        String three = "device";

        System.out.println("mobile: " + one.hashCode());
        System.out.println("touch: " + two.hashCode());
        System.out.println("device: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(phone));
    }
}
