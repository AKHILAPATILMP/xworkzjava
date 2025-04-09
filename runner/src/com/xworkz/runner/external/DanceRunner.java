package com.xworkz.runner.external;

import com.xworkz.runner.internal.Dance;

public class DanceRunner { public static void main(String[] args) {
    Dance dance = new Dance("Ballet", "France", false);
    System.out.println("dance" + dance.toString());
}
}
