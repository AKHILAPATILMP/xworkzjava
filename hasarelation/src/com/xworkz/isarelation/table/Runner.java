package com.xworkz.isarelation.table;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartTable using Table reference");
            Table tableRef = new SmartTable();
            tableRef.placeObjects();
            tableRef.adjustHeight();
            tableRef.fold();
            tableRef.move();

            System.out.println("\nCreating an instance of SmartTable using subclass reference");
            SmartTable smartTable = new SmartTable();
            smartTable.placeObjects();
            smartTable.adjustHeight();
            smartTable.fold();
            smartTable.move();
            smartTable.wirelessCharging();
            smartTable.temperatureControl();
            smartTable.voiceControl();
            smartTable.autoHeightAdjust();
        }
    }

