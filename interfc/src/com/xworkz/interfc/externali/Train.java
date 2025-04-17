package com.xworkz.interfc.externali;

public interface Train {
    void boardTrain();
    void travel();
    void disembark();
    default public void trains() {
        System.out.println("trains");
    }

    void trucks();
}
