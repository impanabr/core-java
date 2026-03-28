class GrinderRunner{
public static void main(String[] args){
	System.out.println("----First Time Method Call----");
	boolean grinderStatus = Grinder.onOrOff();
	System.out.println("Main Method Grinder Status:"+grinderStatus);
	
	System.out.println("----Second Time Method Call----");
	Grinder.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	Grinder.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	Grinder.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	Grinder.onOrOff();
}
}
