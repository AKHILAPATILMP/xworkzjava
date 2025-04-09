package com.xworkz.runner.external;

import com.xworkz.runner.internal.Glance;

public class GlanceRunner { public static void main(String[] args) {
    Glance glance = new Glance(1.2, "Curiosity", "Left");
    System.out.println("glance" + glance.toString());
}
}
