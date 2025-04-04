package com.xworkz.isarelation.cyber;

public class CyberSecurity extends Cyber {

    public CyberSecurity() {
        super();
        System.out.println("CyberSecurity constructor is running - subclass");
    }

    @Override
    public void monitorActivity() {
        System.out.println("Monitoring suspicious logins - subclass");
    }

    @Override
    public void detectThreats() {
        System.out.println("Detecting malware and intrusions - subclass");
    }

    @Override
    public void analyzeData() {
        System.out.println("Analyzing encrypted traffic - subclass");
    }

    @Override
    public void reportIncident() {
        System.out.println("Reporting breach to security team - subclass");
    }
}
