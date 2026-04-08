class Flight {
	
//status
    String flightName;
    String source;
    String destination;
    int passengers;
    int crew;
    double ticketPrice;
    double fuelCapacity;
    boolean isOnTime;
    boolean isInternational;
    int year;

	//behaviour
    public String takeOff(String status){ 
	System.out.println(status); 
	return status; 
	}
    public int bookSeat(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double ticket(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean land(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String route(String path){ 
	System.out.println(path); 
	return path; 
	}
    public int delay(int mins){ 
	System.out.println(mins); 
	return mins; 
	}
    public double fuel(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean cancel(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String crew(String name){ System.out.println(name); return name; }
    public boolean board(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}