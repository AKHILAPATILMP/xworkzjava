package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Phone;

public class PhoneImpli implements Phone {
    @Override
    public void call() {
        System.out.println("Phone is calling");
    }

    @Override
    public void text() {
        System.out.println("Phone is texting");
    }

    @Override
    public void browse() {
        System.out.println("Phone is browsing");
    }
}
