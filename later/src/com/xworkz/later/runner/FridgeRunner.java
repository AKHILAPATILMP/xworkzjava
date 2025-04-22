package com.xworkz.later.runner;

import com.xworkz.later.internal.Fridge;
import com.xworkz.later.internal.FridgeImpl;
import com.xworkz.later.external.FridgeUser;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge = new FridgeImpl();
        FridgeUser fridgeUser = new FridgeUser(fridge); // abstraction
        fridgeUser.activate();
    }
}
