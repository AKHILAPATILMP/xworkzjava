package com.xworkz.equals.internal;

import java.util.Objects;

public class Heat {
    private String source;
    private double temperature;
    private String intensity;
    private String duration;

    public void setSource(String source) {
        this.source = source;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Heat) {
                System.out.println("Heat ref will compare");
                Heat h1 = this;
                Heat h2 = (Heat) obj;

                if (h1.source.equals(h2.source)) {
                    System.out.println("Both heat objects have the same source");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Heat [source=" + source + ", temperature=" + temperature + ", intensity=" + intensity + ", duration=" + duration + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, temperature, intensity, duration);
    }
}
