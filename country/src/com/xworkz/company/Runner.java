package com.xworkz.company;

import com.xworkz.electronics.Laptop;
import com.xworkz.electronics.Mobile;

public class Runner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 75000, "Intel i7");
        laptop.showLaptop();
        Mobile mobile = new Mobile("Samsung Galaxy S24", 5000, "Android 14");
        mobile.showMobile();
    }
}
