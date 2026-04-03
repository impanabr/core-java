class GameConsole{
	String brand;
	String model;
	int storage;
	double price;
	String processor;
	boolean wirelessController;
	
	public GameConsole(String brand,String model,int storage,double price,String processor,boolean wirelessController){
	System.out.println("GameConsole details with parameter:"+brand+","+model+","+storage+","+price+","+processor+","+wirelessController);
}
public GameConsole(){
	System.out.println("default constructor");
}
	
public void display(){
	System.out.println("GameConsole Brand:"+brand);
	System.out.println("GameConsole Model:"+model);
	System.out.println("GameConsole Storage:"+storage);
	System.out.println("GameConsole Price:"+price);
	System.out.println("GameConsole Processor:"+processor);
	System.out.println("GameConsole WirelessController:"+wirelessController);
}
}
