package com.xworkz.isarelation.cyber;
    public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Cyber");
            Cyber cyber = new Cyber();
            cyber.protect();
            cyber.detectThreats();
            cyber.secureData();
            cyber.monitorActivity();
            cyber.encrypt();

            System.out.println("\nCreating an instance of CyberSecurity using Cyber reference");
            Cyber cyberRef = new CyberSecurity();
            cyberRef.protect();
            cyberRef.detectThreats();
            cyberRef.secureData();
            cyberRef.monitorActivity();
            cyberRef.encrypt();

            System.out.println("\nCreating an instance of CyberSecurity using subclass reference");
            CyberSecurity cyberSec = new CyberSecurity();
            cyberSec.protect();
            cyberSec.detectThreats();
            cyberSec.secureData();
            cyberSec.monitorActivity();
            cyberSec.encrypt();
            cyberSec.firewallProtection();
            cyberSec.penetrationTesting();
            cyberSec.malwareDetection();
            cyberSec.accessControl();
            cyberSec.systemAuditing();
        }
    }


