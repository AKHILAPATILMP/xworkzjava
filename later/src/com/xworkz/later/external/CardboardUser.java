package com.xworkz.later.external;

import com.xworkz.later.internal.Cardboard;

public class CardboardUser {

    Cardboard cardboard;

    public CardboardUser(Cardboard cardboard) {
        this.cardboard = cardboard;
        System.out.println("CardboardUser is initialized");
    }

    public void activate() {
        if (this.cardboard != null) {
            this.cardboard.fold();
        } else {
            System.out.println("No cardboard to fold");
        }
    }
}
