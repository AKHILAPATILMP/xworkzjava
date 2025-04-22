package com.xworkz.later.external;

import com.xworkz.later.internal.Alarm;

public class AlarmUser {

    Alarm alarm;

    public AlarmUser(Alarm alarm) {
        this.alarm = alarm;
        System.out.println("AlarmUser is initialized");
    }

    public void activate() {
        if (this.alarm != null) {
            this.alarm.trigger();
        } else {
            System.out.println("No alarm to trigger");
        }
    }
}
