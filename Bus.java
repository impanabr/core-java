class Bus{
String busName;
String busNumber;
String source;
String destination;
double ticketPrice;
int capacity;

public Bus(String busName,String busNumber,String source,String destination,double ticketPrice,int capacity){
System.out.println("Bus Details with parameter:"+busName+","+busNumber+","+source+","+destination+","+ticketPrice+","+capacity);
}
public void display(){
	System.out.println("Bus BusName:"+busName);
	System.out.println("Bus BusNumber:"+busNumber);
	System.out.println("Bus Source:"+source);
	System.out.println("Bus Destination:"+busName);
	System.out.println("Bus TicketPrice:"+ticketPrice);
	System.out.println("Bus Capacity:"+capacity);
}
}
