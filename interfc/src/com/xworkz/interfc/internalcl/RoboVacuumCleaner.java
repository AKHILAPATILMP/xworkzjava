package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.VacuumCleaner;

public class RoboVacuumCleaner implements VacuumCleaner {

    @Override
    public void clean() {
        System.out.println("Vacuum cleaner is cleaning the floor...");
    }

    @Override
    public void emptyDustbin() {
        System.out.println("Emptying the dustbin...");
    }

    @Override
    public void adjustSuction() {
        System.out.println("Adjusting suction power based on surface...");
    }
}
