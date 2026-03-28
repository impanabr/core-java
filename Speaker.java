class Speaker{
static boolean isOn;
static String brand="Sony";
static int maxVolume=100;
static int currentVolume=0;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("Speaker is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("Speaker is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 