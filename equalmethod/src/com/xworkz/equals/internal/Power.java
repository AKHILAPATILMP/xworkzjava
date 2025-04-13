package com.xworkz.equals.internal;

import java.util.Objects;

public class Power {
    private String source;
    private int voltage;
    private double current;
    private String application;

    public void setSource(String source) {
        this.source = source;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Power) {
                System.out.println("Power ref will compare");
                Power p1 = this;
                Power p2 = (Power) obj;

                if (p1.source.equals(p2.source)) {
                    System.out.println("Both powers  have the same source");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Power [source=" + source + ", voltage=" + voltage + ", current=" + current + ", application=" + application + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, voltage, current, application);
    }
}
