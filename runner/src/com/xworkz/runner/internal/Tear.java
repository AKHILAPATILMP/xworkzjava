package com.xworkz.runner.internal;

public class Tear {
    private String cause;
    private int count;
    private String emotionExpressed;

    public Tear(String cause, int count, String emotionExpressed) {
        this.cause = cause;
        this.count = count;
        this.emotionExpressed = emotionExpressed;
    }

    @Override
    public String toString() {
        return "[cause=" + cause + ", count=" + count + ", emotionExpressed=" + emotionExpressed + "]";
    }
}
