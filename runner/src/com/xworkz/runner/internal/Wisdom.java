package com.xworkz.runner.internal;

public class Wisdom {
    private String source;
    private int age;
    private boolean isTimeless;

    public Wisdom(String source, int age, boolean isTimeless) {
        this.source = source;
        this.age = age;
        this.isTimeless = isTimeless;
    }

    @Override
    public String toString() {
        return "[source=" + source + ", age=" + age + ", isTimeless=" + isTimeless + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 3005;
    }
}
