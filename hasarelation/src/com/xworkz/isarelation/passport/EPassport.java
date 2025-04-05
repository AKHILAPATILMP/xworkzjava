package com.xworkz.isarelation.passport;

public class EPassport extends Passport {

    public EPassport() {
        super();
        System.out.println("EPassport constructor is running - subclass");
    }

    @Override
    public void apply() {
        System.out.println("Applying for an electronic passport - subclass");
    }

    @Override
    public void verify() {
        System.out.println("Verifying biometric and documents - subclass");
    }

    @Override
    public void issue() {
        System.out.println("Issuing secure EPassport - subclass");
    }

    @Override
    public void renew() {
        System.out.println("EPassport renewed online - subclass");
    }
}
