package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Computer;

public class DesktopComputerImpli implements Computer {

    @Override
    public void start() {
        System.out.println("Desktop computer started");
    }

    @Override
    public void shutdown() {
        System.out.println("Desktop computer shut down");
    }

    @Override
    public void restart() {
        System.out.println("Desktop computer restarted");
    }

    @Override
    public void operate(){
        System.out.println("operate");
    }
}
