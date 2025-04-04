package com.xworkz.isarelation.cyber;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Cyber");
        Cyber cyber = new Cyber();
        cyber.monitorActivity();
        cyber.detectThreats();
        cyber.analyzeData();
        cyber.reportIncident();

        System.out.println("\nCreating an instance of CyberSecurity using Cyber reference");
        Cyber cyberRef = new CyberSecurity();
        cyberRef.monitorActivity();
        cyberRef.detectThreats();
        cyberRef.analyzeData();
        cyberRef.reportIncident();

        System.out.println("\nCreating an instance of CyberSecurity using subclass reference");
        CyberSecurity cyberSec = new CyberSecurity();
        cyberSec.monitorActivity();
        cyberSec.detectThreats();
        cyberSec.analyzeData();
        cyberSec.reportIncident();
    }
}
