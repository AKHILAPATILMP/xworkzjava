package com.xworkz.interfc.externali;

public interface Toaster {
    void toast();
    void adjustBrowning();
    void cancelToast();
    default void toast1() {
        System.out.println("toast1");
    }
}
