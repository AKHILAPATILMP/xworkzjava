package com.xworkz.runner.external;

import com.xworkz.runner.internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("Fossil", "Smart", 9999);
        String watchString = watch.toString();
        System.out.println("watch" + watchString);
    }
}
