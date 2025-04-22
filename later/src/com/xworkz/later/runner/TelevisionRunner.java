package com.xworkz.later.runner;

import com.xworkz.later.internal.Television;
import com.xworkz.later.internal.TelevisionImpl;
import com.xworkz.later.external.TelevisionUser;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television television = new TelevisionImpl();
        TelevisionUser televisionUser = new TelevisionUser(television); // abstraction
        televisionUser.activate();
    }
}
