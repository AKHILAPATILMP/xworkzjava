package com.xworkz.equals.external;

import com.xworkz.equals.internal.Router;

public class RouterRunner {
    public static void main(String[] args) {

        Router router1 = new Router();
        router1.setBrand("TP-Link");
        router1.setSpeed(1200);
        router1.setIsWireless(true);

        Router router2 = new Router();
        router2.setBrand("TP-Link");
        router2.setSpeed(1200);
        router2.setIsWireless(true);

        boolean same = router1.equals(router2);
        System.out.println("router1 equals router2: " + same);

        System.out.println("Router 1: " + router1);
        System.out.println("Router 2: " + router2);

        System.out.println("Router 1 hashCode: " + router1.hashCode());
        System.out.println("Router 2 hashCode: " + router2.hashCode());
    }
}
