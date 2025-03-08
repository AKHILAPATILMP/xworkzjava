class RCB {
    static void trainPlayers() { System.out.println("RCB players are training for IPL."); }
    static void selectCaptain() { System.out.println("RCB selects a team captain."); }
    static void playMatch() { System.out.println("RCB plays a crucial IPL match."); }
    static void strategize() { System.out.println("RCB coaches discuss match strategies."); }
    static void engageFans() { System.out.println("RCB interacts with fans on social media."); }

    // Invoking methods from IPLTeam class
    static void invokeIPLTeamMethods() {
        IPLTeam.buyPlayers();
        IPLTeam.setupPractice();
        IPLTeam.scheduleMatches();
        IPLTeam.manageSponsorships();
        IPLTeam.reviewPerformance();
    }

    public static void main(String[] args) {
        trainPlayers();
        selectCaptain();
        playMatch();
        strategize();
        engageFans();

        invokeIPLTeamMethods();
    }
}

class IPLTeam {
    static void buyPlayers() { System.out.println("IPL team buys new players."); }
    static void setupPractice() { System.out.println("IPL team schedules practice sessions."); }
    static void scheduleMatches() { System.out.println("IPL team schedules their matches."); }
    static void manageSponsorships() { System.out.println("Managing team sponsorships."); }
    static void reviewPerformance() { System.out.println("Reviewing the team's performance."); }
}