package com.xworkz.equals.external;

import com.xworkz.equals.internal.HardDrive;

public class HardDriveRunner {
    public static void main(String[] args) {

        HardDrive d1 = new HardDrive();
        d1.setBrand("Seagate");
        d1.setCapacity(1024);
        d1.setType("HDD");
        d1.setIsExternal(true);

        HardDrive d2 = new HardDrive();
        d2.setBrand("Seagate");
        d2.setCapacity(1024);
        d2.setType("SSD");
        d2.setIsExternal(false);

        boolean same = d1.equals(d2);
        System.out.println("d1 equals d2: " + same);

        System.out.println("HardDrive 1: " + d1);
        System.out.println("HardDrive 2: " + d2);

        System.out.println("HardDrive 1 hashCode: " + d1.hashCode());
        System.out.println("HardDrive 2 hashCode: " + d2.hashCode());
    }
}
