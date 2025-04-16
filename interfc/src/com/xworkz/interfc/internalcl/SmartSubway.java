package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Subway;

public class SmartSubway implements Subway {

    @Override
    public void boardSubway() {
        System.out.println("board subway");
    }

    @Override
    public void travel() {
        System.out.println("travel the world");
    }

    @Override
    public void disembark() {
        System.out.println("dise marker");
    }
}