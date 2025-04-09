package com.xworkz.runner.external;

import com.xworkz.runner.internal.Router;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router("TP-Link", 300, 2200);
        String routerString = router.toString();
        System.out.println("router" + routerString);

    }
}
