class Watch{
String brand;
String type;
String  color;
double price;
int bateryLife;
boolean waterproof;

public Watch(String brand,String type,String color,double price,int bateryLife,boolean waterproof){
	System.out.println("Watch details with parameter:"+brand+","+type+","+color+","+price+","+bateryLife+","+waterproof);
}
public Watch(){
	System.out.println("default constructor");
}

public void display(){
	System.out.println("Watch Brand:"+brand);
	System.out.println("Watch Type:"+type);
	System.out.println("Watch Color:"+color);
	System.out.println("Watch Price:"+price);
	System.out.println("Watch BateryLife:"+bateryLife);
	System.out.println("Watch WaterProof:"+waterproof);
}
}
