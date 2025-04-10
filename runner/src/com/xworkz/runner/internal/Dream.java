package com.xworkz.runner.internal;

public class Dream {
    private String theme;
    private boolean isLucid;
    private double duration;

    public Dream(String theme, boolean isLucid, double duration) {
        this.theme = theme;
        this.isLucid = isLucid;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "[theme=" + theme + ", isLucid=" + isLucid + ", duration=" + duration + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 777;
    }
}
