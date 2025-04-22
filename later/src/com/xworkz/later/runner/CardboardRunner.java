package com.xworkz.later.runner;

import com.xworkz.later.internal.Cardboard;
import com.xworkz.later.internal.CardboardImpl;
import com.xworkz.later.external.CardboardUser;

public class CardboardRunner {
    public static void main(String[] args) {
        Cardboard cardboard = new CardboardImpl();
        CardboardUser cardboardUser = new CardboardUser(cardboard); // abstraction
        cardboardUser.activate();
    }
}
