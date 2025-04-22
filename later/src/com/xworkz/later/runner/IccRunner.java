package com.xworkz.later.runner;

import com.xworkz.later.internal.Icc;
import com.xworkz.later.internal.IndianCricketTeamIccImpl;
import com.xworkz.later.external.Bcci;

public class IccRunner {
    public static void main(String[] args) {
        Icc icc = new IndianCricketTeamIccImpl();
        Bcci bcci = new Bcci(icc); // abstraction
        bcci.ensureFairPlay();
    }
}
