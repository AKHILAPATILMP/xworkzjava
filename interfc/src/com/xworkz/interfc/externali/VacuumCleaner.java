package com.xworkz.interfc.externali;

public interface VacuumCleaner {
    void clean();
    void emptyDustbin();
    void adjustSuction();
    default void cleaner() {
        System.out.println("cleaner");
    }
}
