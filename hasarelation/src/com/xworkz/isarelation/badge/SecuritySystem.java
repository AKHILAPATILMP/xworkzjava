package com.xworkz.isarelation.badge;
public class SecuritySystem {
    public void verify(Badge badge) {
            badge.removeBadge();
            badge.issueBadge();
            badge.scanBadge();
            badge.revokeBadge();
            badge.displayBadgeInfo();

            if (badge instanceof IDBadge) {
                System.out.println("Casting: badge is instance of IDBadge");
                IDBadge idBadge = (IDBadge) badge;
                idBadge.wearBadge();
            }

        }
    }

