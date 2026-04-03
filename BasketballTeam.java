class BasketballTeam {

    String teamName;
    String captainName;
    static int noOfPlayers = 5;
    String coachName;
    String league;
    String jerseyColor;

    public BasketballTeam() {
    }

    public BasketballTeam(String teamName, String captainName, String coachName, String league, String jerseyColor) {
        this.teamName = teamName;
        this.captainName = captainName;
        this.coachName = coachName;
        this.league = league;
        this.jerseyColor = jerseyColor;
    }

    public void display() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Captain: " + captainName);
        System.out.println("Players: " + noOfPlayers);
        System.out.println("Coach: " + coachName);
        System.out.println("League: " + league);
        System.out.println("Jersey: " + jerseyColor);
    }
}