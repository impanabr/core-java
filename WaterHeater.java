class WaterHeater{
static boolean isOn;
static int Temperature=0;
static int maxTemperature=75;
static String brand="Bajaj";

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("WaterHeater is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("WaterHeater is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 