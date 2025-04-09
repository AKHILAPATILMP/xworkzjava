package com.xworkz.runner.external;

import com.xworkz.runner.internal.Taste;

public class TasteRunner { public static void main(String[] args) {
    Taste taste = new Taste("Mango", 7, true);
    System.out.println("taste" + taste.toString());
}
}
