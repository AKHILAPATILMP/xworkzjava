package com.xworkz.runner.internal;

public class Tear {
    private boolean emotional;
    private String reason;
    private double dropSize;

    public Tear(boolean emotional, String reason, double dropSize) {
        this.emotional = emotional;
        this.reason = reason;
        this.dropSize = dropSize;
    }

    @Override
    public String toString() {
        return "[emotional=" + emotional + ", reason=" + reason + ", dropSize=" + dropSize + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 2102;
    }
}
