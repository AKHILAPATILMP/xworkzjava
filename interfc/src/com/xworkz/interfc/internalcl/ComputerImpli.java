package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Computer;

public class ComputerImpli implements Computer {
    @Override
    public void start() {
        System.out.println("Computer started");
    }

    @Override
    public void shutdown() {
        System.out.println("Computer shut down");
    }

    @Override
    public void restart() {
        System.out.println("Computer restarted");
    }
}
