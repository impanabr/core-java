class PanasonicAcRunner{
public static void main(String[] ac){
	System.out.println("----First Time Method Call----");
	boolean acStatus = PanasonicAc.onOrOff();
	System.out.println("Main Method AC Status:"+acStatus);
	
	System.out.println("----Second Time Method Call----");
	PanasonicAc.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	PanasonicAc.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	PanasonicAc.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	PanasonicAc.onOrOff();
}
}
