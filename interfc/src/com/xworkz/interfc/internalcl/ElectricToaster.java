package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Toaster;

public class ElectricToaster implements Toaster {

    @Override
    public void toast() {
        System.out.println("Toasting the bread...");
    }

    @Override
    public void adjustBrowning() {
        System.out.println("Adjusting the browning level...");
    }

    @Override
    public void cancelToast() {
        System.out.println("Cancelling the toasting process...");
    }
}
