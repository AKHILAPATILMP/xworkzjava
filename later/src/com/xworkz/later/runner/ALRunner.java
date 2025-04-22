package com.xworkz.later.runner;

import com.xworkz.later.internal.Alarm;
import com.xworkz.later.internal.AlarmImpl;
import com.xworkz.later.external.AlarmUser;

public class ALRunner {
    public static void main(String[] args) {
        Alarm alarm = new AlarmImpl();
        AlarmUser alarmUser = new AlarmUser(alarm); // abstraction
        alarmUser.activate();
    }
}
