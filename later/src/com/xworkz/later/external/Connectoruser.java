package com.xworkz.later.external;

import com.xworkz.later.internal.Connector;

public class Connectoruser {
    Connector connector;

    public Connectoruser(Connector connector) {
        this.connector = connector;
        System.out.println("connector user running");
    }

    public void execute() {
        if (this.connector != null) {
            this.connector.run();
        } else {
        }

    }
}
