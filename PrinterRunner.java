class PrinterRunner{
public static void main(String[] page){
	System.out.println("----First Time Method Call----");
	boolean printerStatus = Printer.onOrOff();
	System.out.println("Main Method Printer Status:"+printerStatus);
	
	System.out.println("----Second Time Method Call----");
	Printer.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	Printer.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	Printer.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
	Printer.onOrOff();
}
}
