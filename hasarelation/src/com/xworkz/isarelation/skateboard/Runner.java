package com.xworkz.isarelation.skateboard;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Skateboard");
        Skateboard board = new Skateboard();
        board.ride();
        board.brake();
        board.performTrick();
        board.stop();

        System.out.println("\nCreating an instance of ElectricSkateboard using Skateboard reference");
        Skateboard boardRef = new ElectricSkateboard();
        boardRef.ride();
        boardRef.brake();
        boardRef.performTrick();
        boardRef.stop();

        System.out.println("\nCreating an instance of ElectricSkateboard using subclass reference");
        ElectricSkateboard electricBoard = new ElectricSkateboard();
        electricBoard.ride();
        electricBoard.brake();
        electricBoard.performTrick();
        electricBoard.stop();
    }
}


