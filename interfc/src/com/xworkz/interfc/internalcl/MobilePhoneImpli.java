package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Phone;

public class MobilePhoneImpli implements Phone {

    @Override
    public void call() {
        System.out.println("Mobile phone making a call");
    }

    @Override
    public void text() {
        System.out.println("Mobile phone sending a text");
    }

    @Override
    public void browse() {
        System.out.println("Mobile phone browsing the internet");
    }
}
