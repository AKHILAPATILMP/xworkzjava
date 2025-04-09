package com.xworkz.runner.external;

import com.xworkz.runner.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 16, 60000);
        String laptopstring=laptop.toString();
        System.out.println("laptop"+laptopstring);
}

}
