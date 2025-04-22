package com.xworkz.later.runner;

import com.xworkz.later.internal.Router;
import com.xworkz.later.internal.RouterImpl;
import com.xworkz.later.external.RouterUser;

public class RRunner {
    public static void main(String[] args) {
        Router router = new RouterImpl();
        RouterUser routerUser = new RouterUser(router); // abstraction
        routerUser.activate();
    }
}
