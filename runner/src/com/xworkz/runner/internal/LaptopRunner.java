package com.xworkz.runner.internal;

import com.xworkz.runner.external.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 16, 60000);
        String laptopstring=laptop.toString();
        System.out.println("laptop"+laptopstring);
}

}
