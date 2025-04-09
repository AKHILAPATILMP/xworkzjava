package com.xworkz.runner.external;

import com.xworkz.runner.internal.Table;

public class TableRunner {
    public static void main(String[] args) {
        Table table = new Table("Wood", "Black", 2500);
        System.out.println("table" + table.toString());
    }
}
