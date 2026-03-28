class PanasonicAc{
static boolean isSwitch;
static int maxTemperature=5;
static int minTemperature=10;
static int currentTemperature=24;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isSwitch==false){
	isSwitch=true;
System.out.println("AC is ON:"+ isSwitch);
}
else{
	isSwitch=false;
System.out.println("AC is OFF:"+ isSwitch);
}
System.out.println("onOrOff method ended");
return isSwitch;
}
}
 