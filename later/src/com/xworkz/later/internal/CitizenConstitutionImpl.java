package com.xworkz.later.internal;

public class CitizenConstitutionImpl implements Constitution {

    public CitizenConstitutionImpl() {
        super();
        System.out.println("CitizenConstitutionImpl constructor running");
    }

    @Override
    public void followLaws() {
        System.out.println("Citizens must follow the laws of the Constitution");
    }
}
