class Grinder{
static boolean isOn;
static int maxSpeed=3;
static int minSpeed=1;
static int currentSpeed=0;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("Grinder is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("Grinder is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 