class KabaddiTeam {
    String teamName;
    String captainName;
    static int noOfPlayers = 7;
    String coachName;
    String owner;
    String jerseyColor;

    public KabaddiTeam() {
    }
    public KabaddiTeam(String teamName,String captainName,String coachName,String owner,String jerseyColor) {
        this.teamName = teamName;
        this.captainName = captainName;
        this.coachName = coachName;
        this.owner = owner;
        this.jerseyColor = jerseyColor;
    }
    public void display() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Captain: " + captainName);
        System.out.println("Players: " + noOfPlayers);
        System.out.println("Coach: " + coachName);
        System.out.println("Owner: " + owner);
        System.out.println("Jersey: " + jerseyColor);
    }
}