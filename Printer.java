class Printer{
static boolean isOn;
static String brand="HP";
static int maxPages=100;
static int printedPages=0;

public static boolean onOrOff(){
	
System.out.println("OnOrOff method started");
if(isOn==false){
	isOn=true;
System.out.println("AC is ON:"+ isOn);
}
else{
	isOn=false;
System.out.println("AC is OFF:"+ isOn);
}
System.out.println("onOrOff method ended");
return isOn;
}
}
 