package com.xworkz.equals.internal;

import java.util.Objects;

public class NailPaint {
    private String color;
    private String finish;
    private double volume;
    private boolean isLongLasting;

    public void setColor(String color) {
        this.color = color;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setIsLongLasting(boolean isLongLasting) {
        this.isLongLasting = isLongLasting;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof NailPaint) {
                System.out.println("NailPaint ref will compare");
                NailPaint n1 = this;
                NailPaint n2 = (NailPaint) obj;

                if (n1.color.equals(n2.color) && n1.finish.equals(n2.finish)) {
                    System.out.println("Both nail paints have the same color and finish");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "NailPaint [color=" + color + ", finish=" + finish + ", volume=" + volume + ", isLongLasting=" + isLongLasting + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, finish, volume, isLongLasting);
    }
}
