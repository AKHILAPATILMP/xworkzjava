package com.xworkz.equals.internal;

import java.util.Objects;

public class SonarPanel {
    private String type;
    private double frequency;
    private String manufacturer;
    private int range;

    public void setType(String type) {
        this.type = type;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof SonarPanel) {
                System.out.println("SonarPanel ref will compare");
                SonarPanel s1 = this;
                SonarPanel s2 = (SonarPanel) obj;

                if (s1.type.equals(s2.type)) {
                    System.out.println("Both sonar panels have the same type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "SonarPanel [type=" + type + ", frequency=" + frequency + ", manufacturer=" + manufacturer + ", range=" + range + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, frequency, manufacturer, range);
    }
}
