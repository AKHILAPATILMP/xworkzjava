package com.xworkz.equals.internal;

import java.util.Objects;

public class Tornado {
    private String name;
    private double windSpeed;
    private String origin;
    private boolean isSevere;

    public void setName(String name) {
        this.name = name;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setIsSevere(boolean isSevere) {
        this.isSevere = isSevere;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Tornado) {
                System.out.println("Tornado ref will compare");
                Tornado t1 = this;
                Tornado t2 = (Tornado) obj;

                if (t1.windSpeed == t2.windSpeed) {
                    System.out.println("Both tornadoes have the same wind speed");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tornado [name=" + name + ", windSpeed=" + windSpeed + ", origin=" + origin + ", isSevere=" + isSevere + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, windSpeed, origin, isSevere);
    }
}
