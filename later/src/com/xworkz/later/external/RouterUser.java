package com.xworkz.later.external;

import com.xworkz.later.internal.Router;

public class RouterUser {

    Router router;

    public RouterUser(Router router) {
        this.router = router;
        System.out.println("RouterUser is initialized");
    }

    public void activate() {
        if (this.router != null) {
            this.router.connect();
        } else {
            System.out.println("No router to connect");
        }
    }
}
