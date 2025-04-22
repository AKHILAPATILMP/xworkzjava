package com.xworkz.later.runner;

import com.xworkz.later.internal.Furnace;
import com.xworkz.later.internal.FurnaceImpl;
import com.xworkz.later.external.FurnaceUser;

public class FRunner {
    public static void main(String[] args) {
        Furnace furnace = new FurnaceImpl();
        FurnaceUser furnaceUser = new FurnaceUser(furnace); // abstraction
        furnaceUser.activate();
    }
}
