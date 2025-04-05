package com.xworkz.isarelation.whiteboard;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of WhiteBoard");
        WhiteBoard board = new WhiteBoard();
        board.write();
        board.erase();
        board.clean();
        board.displaySurface();

        System.out.println("\nCreating an instance of DigitalWhiteBoard using WhiteBoard reference");
        WhiteBoard boardRef = new DigitalWhiteBoard();
        boardRef.write();
        boardRef.erase();
        boardRef.clean();
        boardRef.displaySurface();

        System.out.println("\nCreating an instance of DigitalWhiteBoard using subclass reference");
        DigitalWhiteBoard digitalBoard = new DigitalWhiteBoard();
        digitalBoard.write();
        digitalBoard.erase();
        digitalBoard.clean();
        digitalBoard.displaySurface();
    }
}
