package com.xworkz.isarelation.table;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartTable using Table reference");
            Table tableRef = new WoodenTable();
            tableRef.clean();
            tableRef.provideSurface();
            tableRef.fold();
            tableRef.supportItems();

            System.out.println("\nCreating an instance of SmartTable using subclass reference");
            WoodenTable smartTable = new WoodenTable();
            smartTable.clean();
            smartTable.provideSurface();
            smartTable.fold();
            smartTable.supportItems();

        }
    }

