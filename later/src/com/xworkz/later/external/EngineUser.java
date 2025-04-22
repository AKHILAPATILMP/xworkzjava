package com.xworkz.later.external;

import com.xworkz.later.internal.Engine;

public class EngineUser {

    Engine engine;

    public EngineUser(Engine engine) {
        this.engine = engine;
        System.out.println("EngineUser is initialized");
    }

    public void startEngine() {
        if (this.engine != null) {
            this.engine.ignite();
        } else {
            System.out.println("No engine to ignite");
        }
    }
}
