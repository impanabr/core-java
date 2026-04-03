class Restaurant{
String name;
String location;
String cuisine;
double rating;
int seatingCapacity;
boolean homeDelivery;

public Restaurant(String name,String location,String cuisine,double rating,int seatingCapacity,boolean homeDelivery){
	System.out.println("Restaurant details with parameter:"+name+","+location+","+cuisine+","+rating+","+seatingCapacity+","+homeDelivery);
}
public Restaurant(){
	System.out.println("default constructor");
}
public void display(){
	System.out.println("Restaurant Name:"+name);
	System.out.println("Restaurant Location:"+location);
	System.out.println("Restaurant Cuisine:"+cuisine);
	System.out.println("Restaurant Rating:"+rating);
	System.out.println("Restaurant SeatingCapacity:"+seatingCapacity);
	System.out.println("Restaurant HomeDelivery:"+homeDelivery);
}
}
