class WashingMachineRunner{
public static void main(String[] cloths){
	System.out.println("----First Time Method Call----");
	boolean washingmachineStatus = WashingMachine.onOrOff();
	System.out.println("Main Method WashingMachineStatus:"+washingmachineStatus);
	
	System.out.println("----Second Time Method Call----");
	WashingMachine.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	WashingMachine.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	WashingMachine.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	WashingMachine.onOrOff();
}
}
