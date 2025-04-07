package com.xworkz.isarelation.cyber;

public class CyberSecurity extends Cyber {

    public CyberSecurity() {
        super();
        System.out.println("CyberSecurity constructor is running - subclass");
    }

    @Override
    public void scanNetwork() {
        System.out.println("CyberSecurity scans with AI-based tools - subclass");
    }

    @Override
    public void monitorTraffic() {
        System.out.println("CyberSecurity uses firewall for traffic monitoring - subclass");
    }

    @Override
    public void detectThreat() {
        System.out.println("CyberSecurity performs advanced threat detection - subclass");
    }

    @Override
    public void reportIncident() {
        System.out.println("CyberSecurity sends incident reports to SOC - subclass");
    }

    @Override
    public void updateSystem() {
        System.out.println("CyberSecurity updates patches automatically - subclass");
    }

    public void encryptData() {
        System.out.println("CyberSecurity encrypts sensitive data - subclass specific");
    }
}
