package com.xworkz.later.runner;

import com.xworkz.later.internal.Lens;
import com.xworkz.later.internal.LensImpl;
import com.xworkz.later.external.LensUser;

public class LERunner {
    public static void main(String[] args) {
        Lens lens = new LensImpl();
        LensUser lensUser = new LensUser(lens); // abstraction
        lensUser.activate();
    }
}
