package com.xworkz.runner.internal;

public class Change {
    private String type;
    private String reason;
    private int year;

    public Change(String type, String reason, int year) {
        this.type = type;
        this.reason = reason;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", reason=" + reason + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 404;
    }
}
