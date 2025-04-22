package com.xworkz.later.runner;

import com.xworkz.later.internal.Engine;
import com.xworkz.later.internal.EngineImpl;
import com.xworkz.later.external.EngineUser;

public class ERunner {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        EngineUser engineUser = new EngineUser(engine); // abstraction
        engineUser.startEngine();
    }
}
