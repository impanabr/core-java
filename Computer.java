class Computer{
static boolean isOn;
static String brand="Dell";
static int ram=8;
static int storage=512;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("Computer is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("Computer is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 