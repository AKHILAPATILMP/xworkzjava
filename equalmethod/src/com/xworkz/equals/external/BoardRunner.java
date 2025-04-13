package com.xworkz.equals.external;

import com.xworkz.equals.internal.Board;

public class BoardRunner {
    public static void main(String[] args) {

        Board board1 = new Board();
        board1.setType("Whiteboard");

        Board board2 = new Board();
        board2.setType("Whiteboard");

        boolean same = board1.equals(board2);
        System.out.println("board1 equals board2: " + same);

        System.out.println("Board 1: " + board1);
        System.out.println("Board 2: " + board2);

        System.out.println("Board 1 hashCode: " + board1.hashCode());
        System.out.println("Board 2 hashCode: " + board2.hashCode());
    }
}
