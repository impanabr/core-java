class Cinema {
//status
    String name;
    String location;
    int screens;
    int seats;
    double ticketPrice;
    double collection;
    boolean isOpen;
    boolean hasAC;
    String manager;
    int year;
//behaviour
    public String playMovie(String name){ 
	System.out.println(name); 
	return name; 
	}
    public int bookTicket(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double collect(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean show(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String cancel(String name){ 
	System.out.println(name); 
	return name; 
	}
    public int seats(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double snacks(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean clean(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String timing(String time){ 
	System.out.println(time); 
	return time; 
	}
    public boolean close(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}