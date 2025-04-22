package com.xworkz.later.runner;

import com.xworkz.later.internal.Compass;
import com.xworkz.later.internal.CompassImpl;
import com.xworkz.later.external.CompassUser;

public class CORunner {
    public static void main(String[] args) {
        Compass compass = new CompassImpl();
        CompassUser compassUser = new CompassUser(compass); // abstraction
        compassUser.activate();
    }
}
