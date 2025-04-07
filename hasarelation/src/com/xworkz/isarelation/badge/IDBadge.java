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

    @Override
    public void removeBadge() {
        System.out.println("IDBadge removing a badge-subclass");
    }
    public void wearBadge(){
        System.out.println("IDBadge is wearing");
    }
}
