package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Computer;
import com.xworkz.interfc.externali.Curtain;

public class Book implements Computer, Curtain {
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdowm");
    }

    @Override
    public void restart() {
        System.out.println("restart it");
    }

    @Override
    public void operate() {
        Computer.super.operate();
    }

    @Override
    public void open() {
        System.out.println("open it");
    }

    @Override
    public void close() {
        System.out.println("close");
    }

    @Override
    public void wash() {
        System.out.println("wash");
    }
}
