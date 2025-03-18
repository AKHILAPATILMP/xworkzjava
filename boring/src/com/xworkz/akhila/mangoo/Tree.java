package com.xworkz.akhila.mangoo;

public class Tree {
    void grow(Mango mango) {
        if (mango != null) {
            mango.ripen();
        } else {
            System.out.println("No mango is growing on the tree");
        }
    }
}
