class ProjectorRunner{
public static void main(String[] image){
	System.out.println("----First Time Method Call----");
	boolean projectorStatus = Projector.onOrOff();
	System.out.println("Main Method ProjectorStatus:"+projectorStatus);
	
	System.out.println("----Second Time Method Call----");
	Projector.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	Projector.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	Projector.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	Projector.onOrOff();
}
}
