package com.xworkz.isarelation.cells;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Cell");
            Cell cell = new Cell();
            cell.divide();
            cell.grow();
            cell.generateEnergy();
            cell.communicate();
            cell.repair();

            System.out.println("\nCreating an instance of StemCell using Cell reference");
            Cell cellRef = new StemCell();
            cellRef.divide();
            cellRef.grow();
            cellRef.generateEnergy();
            cellRef.communicate();
            cellRef.repair();

            System.out.println("\nCreating an instance of StemCell using subclass reference");
            StemCell stemCell = new StemCell();
            stemCell.divide();
            stemCell.grow();
            stemCell.generateEnergy();
            stemCell.communicate();
            stemCell.repair();
            stemCell.differentiate();
            stemCell.regenerate();
            stemCell.selfRenew();
            stemCell.adapt();
            stemCell.multiplyRapidly();
        }
    }

