package com.xworkz.runner.internal;

public class Dance {
    private String style;
    private String originCountry;
    private boolean isGroupDance;

    public Dance(String style, String originCountry, boolean isGroupDance) {
        this.style = style;
        this.originCountry = originCountry;
        this.isGroupDance = isGroupDance;
    }

    @Override
    public String toString() {
        return "[style=" + style + ", originCountry=" + originCountry + ", isGroupDance=" + isGroupDance + "]";
    }
}
