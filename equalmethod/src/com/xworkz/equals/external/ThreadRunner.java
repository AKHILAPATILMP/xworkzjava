package com.xworkz.equals.external;

import com.xworkz.equals.internal.Thread;

public class ThreadRunner {
    public static void main(String[] args) {

        Thread thread1 = new Thread();
        thread1.setMaterial("Cotton");
        thread1.setLength(100.5);
        thread1.setColor("Red");

        Thread thread2 = new Thread();
        thread2.setMaterial("Cotton");
        thread2.setLength(100.5);
        thread2.setColor("Red");

        boolean same = thread1.equals(thread2);
        System.out.println("thread1 equals thread2: " + same);

        System.out.println("Thread 1: " + thread1);
        System.out.println("Thread 2: " + thread2);

        System.out.println("Thread 1 hashCode: " + thread1.hashCode());
        System.out.println("Thread 2 hashCode: " + thread2.hashCode());
    }
}
