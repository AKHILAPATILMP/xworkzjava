package com.xworkz.equals.internal;

import java.util.Objects;

public class Fingerprint {
    private String pattern;
    private double area;
    private boolean isLeftHand;

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setIsLeftHand(boolean isLeftHand) {
        this.isLeftHand = isLeftHand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Fingerprint) {
                System.out.println("Fingerprint ref will compare");
                Fingerprint fingerprint1 = this;
                Fingerprint fingerprint2 = (Fingerprint) obj;

                if (fingerprint1.pattern.equals(fingerprint2.pattern) && fingerprint1.isLeftHand == fingerprint2.isLeftHand) {
                    System.out.println("Both fingerprints have the same pattern and hand type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fingerprint [pattern=" + pattern + ", area=" + area + ", isLeftHand=" + isLeftHand + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, area, isLeftHand);
    }
}
