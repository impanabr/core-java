class MusicPlayer{
String playerName;
String brand;
String currentSong;
int volumeName;
boolean isPlaying;

public MusicPlayer(String playerName,String brand,String currentSong,int volumeName,boolean isPlaying){
	this.playerName=playerName;
	this.brand=brand;
	this.currentSong=currentSong;
	this.volumeName=volumeName;
	this.isPlaying=isPlaying;
}
public void display(){
	System.out.println("Player Name:"+playerName);
	System.out.println("Brand:"+brand);
	System.out.println("CurrentSong:"+currentSong);
	System.out.println("VolumeName:"+volumeName);
	System.out.println("IsPlaying:"+isPlaying);
}
}
