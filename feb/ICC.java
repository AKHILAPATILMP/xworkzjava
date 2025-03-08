class ICC {
    static void scheduleTournament() { System.out.println("ICC schedules a cricket tournament."); }
    static void setRules() { System.out.println("ICC sets the rules for the game."); }
    static void appointUmpires() { System.out.println("ICC appoints match umpires."); }
    static void organizeWorldCup() { System.out.println("ICC organizes the World Cup."); }
    static void maintainRankings() { System.out.println("ICC maintains player and team rankings."); }

    // Invoking methods from CricketAssociation class
    static void invokeCricketAssociationMethods() {
        CricketAssociation.manageTeams();
        CricketAssociation.organizeLeagues();
        CricketAssociation.handleSponsorships();
        CricketAssociation.trainPlayers();
        CricketAssociation.promoteCricket();
    }

    public static void main(String[] args) {
        scheduleTournament();
        setRules();
        appointUmpires();
        organizeWorldCup();
        maintainRankings();

        invokeCricketAssociationMethods();
    }
}

class CricketAssociation {
    static void manageTeams() { System.out.println("Managing national and domestic teams."); }
    static void organizeLeagues() { System.out.println("Organizing T20 and ODI leagues."); }
    static void handleSponsorships() { System.out.println("Handling sponsorships and funding."); }
    static void trainPlayers() { System.out.println("Providing training programs for players."); }
    static void promoteCricket() { System.out.println("Promoting cricket worldwide."); }
}