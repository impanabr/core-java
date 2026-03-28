class WashingMachine{
static boolean isOn;
static String brand="LG";
static int capacity=7;
static int waterLevel=0;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("WashingMachine is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("WashingMachine is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 