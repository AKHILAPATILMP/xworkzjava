package com.xworkz.runner.external;

import com.xworkz.runner.internal.Tshirt;

public class TRunner {
    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt();
        tshirt1.setBrand("xworkz");
        tshirt1.setSize(50);
        tshirt1.setColor("blue");

        Tshirt tshirt2 = new Tshirt();
        tshirt2.setBrand("xworkz");
        tshirt2.setSize(50);
        tshirt2.setColor("blue");

        boolean same=tshirt1.equals(tshirt2);
        System.out.println("tshirt1 = tshirt2 "+same);
    }

    }
