package com.xworkz.later.internal;

public class Connectorimpl implements Connector{
    @Override
    public void run() {
        System.out.println("running in connectorimpl");
    }
    public Connectorimpl(){
        super();
        System.out.println("run in connector implementation");
    }
}
