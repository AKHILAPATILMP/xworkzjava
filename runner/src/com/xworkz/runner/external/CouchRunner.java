package com.xworkz.runner.external;

import com.xworkz.runner.internal.Couch;

public class CouchRunner {
    public static void main(String[] args) {
        Couch couch = new Couch("Fabric", "Grey", 8500);
        System.out.println("couch" + couch.toString());
    }
}
