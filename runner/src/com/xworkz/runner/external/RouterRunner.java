package com.xworkz.runner.external;

import com.xworkz.runner.internal.Router;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router("TP-Link", 120, true);
        String routerString = router.toString();
        System.out.println("Router details: " + routerString);

        int hash = router.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "wifi";
        String two = "modem";
        String three = "signal";

        System.out.println("wifi: " + one.hashCode());
        System.out.println("modem: " + two.hashCode());
        System.out.println("signal: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(router));
    }
}
