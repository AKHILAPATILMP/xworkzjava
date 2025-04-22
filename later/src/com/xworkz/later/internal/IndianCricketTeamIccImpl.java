package com.xworkz.later.internal;

public class IndianCricketTeamIccImpl implements Icc {

    public IndianCricketTeamIccImpl() {
        super();
        System.out.println("IndianCricketTeamIccImpl constructor running");
    }

    @Override
    public void fairPlay() {
        System.out.println("Indian Cricket Team follows ICC fair play rules");
    }
}
