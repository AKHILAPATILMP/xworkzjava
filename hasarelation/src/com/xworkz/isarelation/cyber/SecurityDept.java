package com.xworkz.isarelation.cyber;

public class SecurityDept {

    public void check(Cyber cyber) {
        cyber.scanNetwork();
        cyber.monitorTraffic();
        cyber.detectThreat();
        cyber.reportIncident();
        cyber.updateSystem();

        if (cyber instanceof CyberSecurity) {
            System.out.println("Casting: Cyber is instance of CyberSecurity");
            CyberSecurity cs = (CyberSecurity) cyber;
            cs.encryptData();
        }
    }
}
