class Laptop {
    static void powerOn() { System.out.println("Laptop is powering on."); }
    static void powerOff() { System.out.println("Laptop is shutting down."); }
    static void openBrowser() { System.out.println("Opening browser."); }
    static void checkBattery() { System.out.println("Battery is at 80%."); }
    static void connectWifi() { System.out.println("Connected to WiFi."); }

    static void useMethods() {
        MNCCompany.companyDetails();  // Calling method from another class
        MNCCompany.getRevenue();
        MNCCompany.getEmployees();
        MNCCompany.getHeadquarters();
        MNCCompany.showCEO();
    }

    public static void main(String[] args) {
        powerOn();
        openBrowser();
        checkBattery();
        connectWifi();
        powerOff();
        useMethods();
    }
}

class MNCCompany {
    static void companyDetails() { System.out.println("MNCCompany is a multinational corporation."); }
    static void getRevenue() { System.out.println("Annual revenue is $100 billion."); }
    static void getEmployees() { System.out.println("Company has 200,000 employees."); }
    static void getHeadquarters() { System.out.println("Headquarters located in New York."); }
    static void showCEO() { System.out.println("CEO is John Doe."); }
}