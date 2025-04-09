package com.xworkz.runner.external;

import com.xworkz.runner.internal.Touch;

public class TouchRunner {public static void main(String[] args) {
    Touch touch = new Touch("Velvet", 0.4, true);
    System.out.println("touch" + touch.toString());
}
}
