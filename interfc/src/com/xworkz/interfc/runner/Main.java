package com.xworkz.interfc.runner;

import com.xworkz.interfc.externali.AC;
import com.xworkz.interfc.internalcl.SmartAC;
import com.xworkz.interfc.intfc1.Account;
import com.xworkz.interfc.intfc1.Student;

public class Main {
    public static void main(String[] args) {
AC intf1=new Student();
intf1.cool();
intf1.heat();
intf1.adjustTemperature();

    }
}
