package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.WashingMachine;

public class FrontLoadWashingMachine implements WashingMachine {

    @Override
    public void wash() {
        System.out.println("Washing clothes with optimal water usage...");
    }

    @Override
    public void rinse() {
        System.out.println("Rinsing clothes thoroughly...");
    }

    @Override
    public void spinDry() {
        System.out.println("Spinning clothes dry at high speed...");
    }
}
