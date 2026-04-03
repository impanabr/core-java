class HockeyTeam {

    String teamName;
    String captainName;
    static int noOfPlayers = 11;
    String coachName;
    String country;
    String jerseyColor;

    public HockeyTeam() {
    }

    public HockeyTeam(String teamName, String captainName, String coachName, String country, String jerseyColor) {
        this.teamName = teamName;
        this.captainName = captainName;
        this.coachName = coachName;
        this.country = country;
        this.jerseyColor = jerseyColor;
    }

    public void display() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Captain: " + captainName);
        System.out.println("Players: " + noOfPlayers);
        System.out.println("Coach: " + coachName);
        System.out.println("Country: " + country);
        System.out.println("Jersey: " + jerseyColor);
    }
}