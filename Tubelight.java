class Tubelight{
static boolean isOn;
static int voltage=220;
static String brand= "Philips";
static int length=4;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("Tubelight is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("Tubelight is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 