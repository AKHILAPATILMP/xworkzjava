package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.BusStop;
import com.xworkz.interfc.externali.Camera;

public class Bank implements BusStop, Camera {
    @Override
    public void waitForBus() {
        System.out.println("wait");
    }

    @Override
    public void boardBus() {
        System.out.println("board");
    }

    @Override
    public void checkSchedule() {
        System.out.println("check");
    }

    @Override
    public void capturePhoto() {
        System.out.println("capture");
    }

    @Override
    public void recordVideo() {
        System.out.println("record");
    }

    @Override
    public void zoom() {
        System.out.println("zoom");
    }
}
