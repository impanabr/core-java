class ComputerRunner{
public static void main(String[] ram){
	System.out.println("----First Time Method Call----");
	boolean computerStatus = Computer.onOrOff();
	System.out.println("Main Method ComputerStatus:"+computerStatus);
	
	System.out.println("----Second Time Method Call----");
	Computer.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	Computer.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	Computer.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	Computer.onOrOff();
}
}
