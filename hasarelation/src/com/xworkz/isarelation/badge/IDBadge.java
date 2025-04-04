package com.xworkz.isarelation.badge;
public class IDBadge extends Badge {

    public IDBadge() {
        super();
        System.out.println("IDBadge constructor is running - subclass");
    }

    @Override
    public void issueBadge() {
        System.out.println("IDBadge is issuing a digital ID badge - subclass");
    }

    @Override
    public void scanBadge() {
        System.out.println("IDBadge is scanning with NFC - subclass");
    }

    @Override
    public void revokeBadge() {
        System.out.println("IDBadge access revoked remotely - subclass");
    }

    @Override
    public void displayBadgeInfo() {
        System.out.println("IDBadge displays user data with QR code - subclass");
    }
}
