package com.xworkz.isarelation.passport;
public class Passport {

    public Passport() {
        System.out.println("Passport constructor is running - parent class");
    }

    public void apply() {
        System.out.println("Applying for a physical passport - parent class");
    }

    public void verify() {
        System.out.println("Verifying documents for passport - parent class");
    }

    public void issue() {
        System.out.println("Issuing passport - parent class");
    }

    public void renew() {
        System.out.println("Renewing passport - parent class");
    }
}

