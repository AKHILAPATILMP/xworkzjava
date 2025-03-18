package com.xworkz.akhila.rcb;

public class RCB {
    void select(Player player) {
        if (player != null) {
            player.play();
        } else {
            System.out.println("No player selected");
        }
    }
}
