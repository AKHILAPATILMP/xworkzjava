package com.xworkz.runner.internal;

public class Change {
    private String type;
    private String reason;
    private boolean isReversible;

    public Change(String type, String reason, boolean isReversible) {
        this.type = type;
        this.reason = reason;
        this.isReversible = isReversible;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", reason=" + reason + ", isReversible=" + isReversible + "]";
    }
}
