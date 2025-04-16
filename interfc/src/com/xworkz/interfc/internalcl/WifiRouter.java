package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Router;

public class WifiRouter implements Router {
    @Override
    public void connect() {
        System.out.println("connect");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect");
    }

    @Override
    public void reset() {
        System.out.println("reset");
    }
}
