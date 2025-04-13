package com.xworkz.equals.external;

import com.xworkz.equals.internal.Telephone;

public class TelephoneRunner {
    public static void main(String[] args) {

        Telephone t1 = new Telephone();
        t1.setModel("DialMaster");
        t1.setYear(1980);
        t1.setIsRotary(true);
        t1.setProvider("BSNL");

        Telephone t2 = new Telephone();
        t2.setModel("DialMaster");
        t2.setYear(1980);
        t2.setIsRotary(false);
        t2.setProvider("Airtel");

        boolean same = t1.equals(t2);
        System.out.println("t1 equals t2: " + same);

        System.out.println("Telephone 1: " + t1);
        System.out.println("Telephone 2: " + t2);

        System.out.println("Telephone 1 hashCode: " + t1.hashCode());
        System.out.println("Telephone 2 hashCode: " + t2.hashCode());
    }
}
