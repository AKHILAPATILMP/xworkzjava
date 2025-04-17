package com.xworkz.interfc.externali;

public interface Iron {
    void heat();
    void ironClothes();
    void steam();
    default void melt(){
        System.out.println("melt");
    }

    void post();
}
