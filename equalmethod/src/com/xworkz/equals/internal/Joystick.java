package com.xworkz.equals.internal;

import java.util.Objects;

public class Joystick {
    private String brand;        // Brand of the joystick (e.g., "Logitech", "Sony")
    private String type;         // Type of joystick (e.g., "Wired", "Wireless")
    private int buttons;         // Number of buttons on the joystick

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Joystick) {
                System.out.println("Joystick ref will compare");
                Joystick joystick1 = this;
                Joystick joystick2 = (Joystick) obj;

                // Compare three properties: brand, type, and buttons
                if (joystick1.brand.equals(joystick2.brand) && joystick1.type.equals(joystick2.type) && joystick1.buttons == joystick2.buttons) {
                    System.out.println("Both joysticks are the same based on brand, type, and buttons");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Joystick [brand=" + brand + ", type=" + type + ", buttons=" + buttons + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, type, buttons);
    }
}
