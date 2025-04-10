package com.xworkz.runner.internal;

public class Whisper {
    private String tone;
    private boolean isSecret;
    private int volumeLevel;

    public Whisper(String tone, boolean isSecret, int volumeLevel) {
        this.tone = tone;
        this.isSecret = isSecret;
        this.volumeLevel = volumeLevel;
    }

    @Override
    public String toString() {
        return "[tone=" + tone + ", isSecret=" + isSecret + ", volumeLevel=" + volumeLevel + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 3004;
    }
}
