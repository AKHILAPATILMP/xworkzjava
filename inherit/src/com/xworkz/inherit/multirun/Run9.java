package com.xworkz.inherit.multirun;

import com.xworkz.inherit.multi.FastCharger;

public class Run9 {
    public static void main(String[] args) {
        FastCharger charger = new FastCharger();
        charger.supplyPower();
        charger.connectUSB();
        charger.chargeQuickly();
    }
}
