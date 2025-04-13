package com.xworkz.equals.internal;

import java.util.Objects;

public class Syringe {
    private String material;
    private double volume;
    private boolean isDisposable;
    private String needleType;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setIsDisposable(boolean isDisposable) {
        this.isDisposable = isDisposable;
    }

    public void setNeedleType(String needleType) {
        this.needleType = needleType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Syringe) {
                System.out.println("Syringe ref will compare");
                Syringe s1 = this;
                Syringe s2 = (Syringe) obj;

                if (s1.material.equals(s2.material) &&
                        s1.volume == s2.volume &&
                        s1.isDisposable == s2.isDisposable) {
                    System.out.println("Both syringes have same material, volume, and disposable status");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Syringe [material=" + material + ", volume=" + volume + ", isDisposable=" + isDisposable + ", needleType=" + needleType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, volume, isDisposable, needleType);
    }
}
