class Router{
	
String brand;
String model;
double speed;
int antennas;
double price;
boolean dualBrand;

public Router(String brand,String model,double speed,int antennas,double price,boolean dualBrand){
	System.out.println("Router details with parameter:"+brand+","+model+","+speed+","+antennas+","+price+","+dualBrand);
}
public Router(){
	System.out.println("default constructor");
}

public void display(){
	System.out.println("Router Brand:"+brand);
	System.out.println("Router Model:"+model);	
	System.out.println("Router Speed:"+speed);
    System.out.println("Router Antennas:"+antennas);
	System.out.println("Router Price:"+price);
	System.out.println("Router DualBrand:"+dualBrand);
}
}
