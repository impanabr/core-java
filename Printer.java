class Printer{
String brand;
String type;
double price;
int speed;
String color;
boolean wifi;

public Printer(String brand,String type,double price,int speed,String color,boolean wifi){
	System.out.println("Printer details with parameter:"+brand+","+type+","+price+","+speed+","+color+","+wifi);
}
public Printer(){
	System.out.println("default constructor");
}

public void display(){
	System.out.println("Printer Brand:"+brand);
	System.out.println("Printer Type:"+type);
	System.out.println("Printer Price:"+price);
	System.out.println("Printer Speed:"+speed);
	System.out.println("Printer Color:"+color);
	System.out.println("Printer Wifi:"+wifi);
}
}
