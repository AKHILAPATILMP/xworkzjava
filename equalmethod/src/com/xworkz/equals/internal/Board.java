package com.xworkz.equals.internal;

import java.util.Objects;

public class Board {
    private String type; // Type of the board (e.g., "Whiteboard", "Blackboard")

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Board) {
                System.out.println("Board ref will compare");
                Board board1 = this;
                Board board2 = (Board) obj;

                if (board1.type.equals(board2.type)) {
                    System.out.println("Both boards are the same type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Board [type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
