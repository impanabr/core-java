class FootballTeam{
 String teamName;
 String captionName;
 static int noofPlayers=11;
 String coachName;
 String country;
 String  jerseyColor;
 
 public FootballTeam(){ 
 }
  public FootballTeam(String teamName,String captionName,String coachName,String country,String jerseyColor){
    this.teamName=teamName;
    this.captionName=captionName;
    this.coachName=coachName;
    this.country=country;
    this.jerseyColor=jerseyColor;
 }
 public void displayTeamDetails(){
	System.out.println("Team Name:"+teamName);
	System.out.println("Caption Name:"+captionName);
	System.out.println("Players :"+noofPlayers);
	System.out.println("Coach Name:"+coachName);
	System.out.println("Country:"+country);
	System.out.println("Jersey Color  :"+jerseyColor);
	}
	}
	