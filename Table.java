class Table{
String material;
int legs;
double price;

public Table(String material,int legs,double price){
	this.material=material;
	this.legs=legs;
	this.price=price;
}
public void display(){
	System.out.println("Material:"+material);
	System.out.println("Legs:"+legs);
	System.out.println("Price:"+price);
}
}
