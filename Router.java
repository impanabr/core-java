class Router{
static boolean isOn;
static String brand="TP-Link";
static int maxDevices=10;
static int currentDevices=0;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("Router is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("Router is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 