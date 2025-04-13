package com.xworkz.equals.internal;

import java.util.Objects;

public class Light {
    private String type;
    private int brightness;
    private String color;
    private boolean isLED;

    public void setType(String type) {
        this.type = type;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsLED(boolean isLED) {
        this.isLED = isLED;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Light) {
            Light other = (Light) obj;
            return this.type.equals(other.type) && this.brightness == other.brightness;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Light [type=" + type + ", brightness=" + brightness + ", color=" + color + ", isLED=" + isLED + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brightness);
    }
}
