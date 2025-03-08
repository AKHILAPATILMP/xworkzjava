class IplCup {
    static void announceWinner() { System.out.println("IPL Cup winner is announced."); }
    static void presentTrophy() { System.out.println("Presenting the IPL Trophy to the winning team."); }
    static void hostFinalMatch() { System.out.println("Hosting the IPL final match."); }
    static void distributePrizeMoney() { System.out.println("Distributing prize money to teams."); }
    static void organizeClosingCeremony() { System.out.println("Organizing the IPL closing ceremony."); }

    // Invoking methods from IPLManagement class
    static void invokeIPLManagementMethods() {
        IPLManagement.handleMedia();
        IPLManagement.secureVenues();
        IPLManagement.scheduleBroadcasts();
        IPLManagement.manageTicketing();
        IPLManagement.ensureSecurity();
    }

    public static void main(String[] args) {
        announceWinner();
        presentTrophy();
        hostFinalMatch();
        distributePrizeMoney();
        organizeClosingCeremony();

        invokeIPLManagementMethods();
    }
}

class IPLManagement {
    static void handleMedia() { System.out.println("Managing media coverage for IPL."); }
    static void secureVenues() { System.out.println("Ensuring venue security."); }
    static void scheduleBroadcasts() { System.out.println("Scheduling IPL broadcasts."); }
    static void manageTicketing() { System.out.println("Managing IPL ticket sales."); }
    static void ensureSecurity() { System.out.println("Providing security for players and fans."); }
}