package com.xworkz.runner.internal;

public class Canvas {
    private String size;
    private String mediumUsed;
    private boolean isFramed;

    public Canvas(String size, String mediumUsed, boolean isFramed) {
        this.size = size;
        this.mediumUsed = mediumUsed;
        this.isFramed = isFramed;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", mediumUsed=" + mediumUsed + ", isFramed=" + isFramed + "]";
    }
}
