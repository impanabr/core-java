class Geometry{
String geometryName;
int numberOfSides;
double area;
double perimeter;
String color;
double length;

public Geometry(String geometryName,int numberOfSides,double area,double perimeter,String color,double length){
	System.out.println("Geometry details with parameter:"+geometryName+","+numberOfSides+","+area+","+perimeter+","+color+","+length);
}
public Geometry(){
	System.out.println("default constructor");
}
public void display(){
	System.out.println("Geometry GeometryName:"+geometryName);
	System.out.println("Geometry NumberOfSides:"+numberOfSides);
	System.out.println("Geometry Area:"+area);
	System.out.println("Geometry Perimater:"+perimeter);
	System.out.println("Geometry Color:"+color);
	System.out.println("Geometry Length:"+length);
}
}
