package com.xworkz.equals.internal;

import java.util.Objects;

public class Keypad {
    private String layout;
    private int numberOfKeys;
    private boolean isBacklit;
    private String material;

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public void setIsBacklit(boolean isBacklit) {
        this.isBacklit = isBacklit;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Keypad) {
                System.out.println("Keypad ref will compare");
                Keypad k1 = this;
                Keypad k2 = (Keypad) obj;

                if (k1.layout.equals(k2.layout) &&
                        k1.numberOfKeys == k2.numberOfKeys &&
                        k1.isBacklit == k2.isBacklit) {
                    System.out.println("Both keypads have same layout, number of keys, and backlit status");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Keypad [layout=" + layout + ", numberOfKeys=" + numberOfKeys + ", isBacklit=" + isBacklit + ", material=" + material + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(layout, numberOfKeys, isBacklit, material);
    }
}
