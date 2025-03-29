package com.xworkz.associate;

public class Board {
        private String type;
        private int noOfBoard;
        private Capacitor capacitor;

        public Board(String type,int noOfBoard,Capacitor capacitor){
            this.type=type;
            this.noOfBoard=noOfBoard;
            this.capacitor=capacitor;

        }
        public void BoardDis(){
            System.out.println("No og Board:"+this.noOfBoard);
            System.out.println("Type of board"+this.type);
            System.out.println("Capacitor:"+this.capacitor);
            capacitor.setPrice(5000);
            this.capacitor.CapDis();
        }
    }


