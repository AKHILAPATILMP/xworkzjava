package com.xworkz.later.runner;

import com.xworkz.later.internal.Sprinkler;
import com.xworkz.later.internal.SprinklerImpl;
import com.xworkz.later.external.SprinklerUser;

public class SprinklerRunner {
    public static void main(String[] args) {
        Sprinkler sprinkler = new SprinklerImpl();
        SprinklerUser sprinklerUser = new SprinklerUser(sprinkler); // abstraction
        sprinklerUser.activate();
    }
}
