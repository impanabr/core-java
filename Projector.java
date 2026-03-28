class Projector{
static boolean isOn;
static String brand="Epson";
static int brightness=3000;
static int currentBrightness=0;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("Projector is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("Projector is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 