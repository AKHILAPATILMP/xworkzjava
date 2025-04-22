package com.xworkz.later.runner;

import com.xworkz.later.external.Connectoruser;
import com.xworkz.later.internal.Connector;
import com.xworkz.later.internal.Connectorimpl;

public class CRunner {
    public static void main(String[] args) {
        Connector connector=new Connectorimpl();
        Connectoruser connectoruser=new Connectoruser(connector);//abstraction
        connectoruser.execute();
       }

}
