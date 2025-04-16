package com.xworkz.inherit.hybrid;

public class HybridRunner {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.compute();
        laptop.code();
        laptop.connectToInternet();

        AllInOne aio = new AllInOne();
        aio.powerOn();
        aio.print();
        aio.copy();
        aio.connectToInternet();

        Tablet tab = new Tablet();
        tab.draw();
        tab.connectToInternet();

        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.connectToInternet();

        SmartTV tv = new SmartTV();
        tv.stream();
        tv.connectToInternet();

        SmartWatch watch = new SmartWatch();
        watch.trackHealth();
        watch.connectToInternet();
    }
}
