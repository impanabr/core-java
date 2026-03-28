class RouterRunner{
public static void main(String[] args){
	System.out.println("----First Time Method Call----");
	boolean routerStatus = Router.onOrOff();
	System.out.println("Main Method Router Status:"+routerStatus);
	
	System.out.println("----Second Time Method Call----");
	Router.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	Router.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	Router.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	Router.onOrOff();
}
}
