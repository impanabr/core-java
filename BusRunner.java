class BusRunner{
	public static void main(String[]args){
		Bus ref=new Bus("KSRTC Exopress","KA01AB1234","Bangalore","Mysore",250.50,30);
		ref.busName="KSRTC Express";
		ref.busNumber="KA01AB1234";
		ref.source="Bangalore";
		ref.destination="Mysore";
		ref.ticketPrice=250.50;
		ref.capacity=50;
		ref.display();
	}
}

