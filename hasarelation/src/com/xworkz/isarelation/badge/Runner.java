package com.xworkz.isarelation.badge;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Badge");
        Badge badge = new Badge();
        badge.issueBadge();
        badge.scanBadge();
        badge.revokeBadge();
        badge.displayBadgeInfo();

        System.out.println("\nCreating an instance of IDBadge using Badge reference");
        Badge badgeRef = new IDBadge();
        badgeRef.issueBadge();
        badgeRef.scanBadge();
        badgeRef.revokeBadge();
        badgeRef.displayBadgeInfo();

        System.out.println("\nCreating an instance of IDBadge using subclass reference");
        IDBadge idBadge = new IDBadge();
        idBadge.issueBadge();
        idBadge.scanBadge();
        idBadge.revokeBadge();
        idBadge.displayBadgeInfo();
    }
}
