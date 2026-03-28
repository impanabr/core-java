class WaterHeaterRunner{
public static void main(String[] cool){
	System.out.println("----First Time Method Call----");
	boolean waterheaterStatus = WaterHeater.onOrOff();
	System.out.println("Main Method WaterHeaterStatus:"+waterheaterStatus);
	
	System.out.println("----Second Time Method Call----");
	WaterHeater.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	WaterHeater.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	WaterHeater.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	WaterHeater.onOrOff();
}
}
