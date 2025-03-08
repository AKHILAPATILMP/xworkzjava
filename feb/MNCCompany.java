class MNCCompany {
    static void hireEmployees() { System.out.println("Hiring new employees."); }
    static void conductMeeting() { System.out.println("Conducting a business meeting."); }
    static void launchProduct() { System.out.println("Launching a new product."); }
    static void analyzeMarket() { System.out.println("Analyzing the market trends."); }
    static void manageFinance() { System.out.println("Managing company finances."); }

    // Invoking methods from Business class
    static void invokeBusinessMethods() {
        Business.makeStrategy();
        Business.expandMarket();
        Business.invest();
        Business.advertise();
        Business.handleClients();
    }

    public static void main(String[] args) {
        // Calling methods within the class
        hireEmployees();
        conductMeeting();
        launchProduct();
        analyzeMarket();
        manageFinance();

        // Invoking methods from another class
        invokeBusinessMethods();
    }
}
class Business {
    static void makeStrategy() { System.out.println("Creating a business strategy."); }
    static void expandMarket() { System.out.println("Expanding into a new market."); }
    static void invest() { System.out.println("Investing in new technology."); }
    static void advertise() { System.out.println("Running advertisements."); }
    static void handleClients() { System.out.println("Handling client relations."); }
}