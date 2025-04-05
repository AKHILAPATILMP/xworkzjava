package com.xworkz.isarelation.passport;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Passport");
        Passport passport = new Passport();
        passport.apply();
        passport.verify();
        passport.issue();
        passport.renew();

        System.out.println("\nCreating an instance of EPassport using Passport reference");
        Passport passportRef = new EPassport();
        passportRef.apply();
        passportRef.verify();
        passportRef.issue();
        passportRef.renew();

        System.out.println("\nCreating an instance of EPassport using subclass reference");
        EPassport ePassport = new EPassport();
        ePassport.apply();
        ePassport.verify();
        ePassport.issue();
        ePassport.renew();
    }
}
