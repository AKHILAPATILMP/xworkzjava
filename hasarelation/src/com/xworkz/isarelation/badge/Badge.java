package com.xworkz.isarelation.badge;

public class Badge {

    public Badge() {
        System.out.println("Badge constructor is running - parent class");
    }

    public void issueBadge() {
        System.out.println("Issuing basic badge - parent class");
    }

    public void scanBadge() {
        System.out.println("Scanning badge - parent class");
    }

    public void revokeBadge() {
        System.out.println("Revoking badge access - parent class");
    }

    public void displayBadgeInfo() {
        System.out.println("Displaying badge information - parent class");
    }
}
