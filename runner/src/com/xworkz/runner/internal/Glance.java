package com.xworkz.runner.internal;

public class Glance {

private double durationInSeconds;
private String emotion;
private String direction;

public Glance(double durationInSeconds, String emotion, String direction) {
    this.durationInSeconds = durationInSeconds;
    this.emotion = emotion;
    this.direction = direction;
}

@Override
public String toString() {
    return "[durationInSeconds=" + durationInSeconds + ", emotion=" + emotion + ", direction=" + direction + "]";
}
    }