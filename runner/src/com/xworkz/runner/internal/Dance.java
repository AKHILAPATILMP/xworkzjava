package com.xworkz.runner.internal;

public class Dance {
    private String style;
    private String origin;
    private int popularity;

    public Dance(String style, String origin, int popularity) {
        this.style = style;
        this.origin = origin;
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "[style=" + style + ", origin=" + origin + ", popularity=" + popularity + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 221;
    }
}
