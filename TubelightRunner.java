class TubelightRunner{
public static void main(String[] bright){
	System.out.println("----First Time Method Call----");
	boolean tubelightStatus = Tubelight.onOrOff();
	System.out.println("Main Method TubelightStatus:"+tubelightStatus);
	
	System.out.println("----Second Time Method Call----");
	Tubelight.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	Tubelight.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	Tubelight.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	Tubelight.onOrOff();
}
}
