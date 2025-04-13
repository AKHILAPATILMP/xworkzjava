package com.xworkz.equals.external;

import com.xworkz.equals.internal.Joystick;

public class JoystickRunner {
    public static void main(String[] args) {

        Joystick joystick1 = new Joystick();
        joystick1.setBrand("Logitech");
        joystick1.setType("Wired");
        joystick1.setButtons(12);

        Joystick joystick2 = new Joystick();
        joystick2.setBrand("Logitech");
        joystick2.setType("Wired");
        joystick2.setButtons(12);

        boolean same = joystick1.equals(joystick2);
        System.out.println("joystick1 equals joystick2: " + same);

        System.out.println("Joystick 1: " + joystick1);
        System.out.println("Joystick 2: " + joystick2);

        System.out.println("Joystick 1 hashCode: " + joystick1.hashCode());
        System.out.println("Joystick 2 hashCode: " + joystick2.hashCode());
    }
}
