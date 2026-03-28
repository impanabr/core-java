class HomeRunner{

public static void main(String[] args){
Home.numberOfRooms=3;
Home.rating=4.5f;
Home.price=4500000.00;
Home.isAvailable=true;
Home.ownerName="Ramesh";

System.out.println("numberOfRooms:"+Home.numberOfRooms);
System.out.println("rating:"+Home.rating);
System.out.println("price:"+Home.price);
System.out.println("isAvailable:"+Home.isAvailable);
System.out.println("ownerName:"+Home.ownerName);
}
}