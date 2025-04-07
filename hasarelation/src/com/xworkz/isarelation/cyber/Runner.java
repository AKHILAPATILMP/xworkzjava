package com.xworkz.isarelation.cyber;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Cyber");
        Cyber cyber = new Cyber();
        cyber.scanNetwork();
        cyber.monitorTraffic();
        cyber.detectThreat();
        cyber.reportIncident();
        cyber.updateSystem();

        System.out.println("\nCreating an instance of CyberSecurity using Cyber reference");
        Cyber cyberRef = new CyberSecurity();
        cyberRef.scanNetwork();
        cyberRef.monitorTraffic();
        cyberRef.detectThreat();
        cyberRef.reportIncident();
        cyberRef.updateSystem();

        System.out.println("\nCreating an instance of CyberSecurity using subclass reference");
        CyberSecurity security = new CyberSecurity();
        security.scanNetwork();
        security.monitorTraffic();
        security.detectThreat();
        security.reportIncident();
        security.updateSystem();
        security.encryptData();

        System.out.println("\nUsing SecurityDept for casting:");
        SecurityDept dept = new SecurityDept();
        dept.check(cyber);
        dept.check(cyberRef);
        dept.check(security);
    }
}
