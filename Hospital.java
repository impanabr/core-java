class Hospital {
//status
    String name;
    String location;
    int doctors;
    int nurses;
    double revenue;
    double expenses;
    boolean emergencyAvailable;
    boolean icuAvailable;
    String chiefDoctor;
    int year;
//behaviour
    public String admitPatient(String name){ 
	System.out.println(name); 
	return name; 
	}
    public int assignRoom(int room){ 
	System.out.println(room); 
	return room; 
	}
    public double generateBill(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean discharge(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String assignDoctor(String doc){ 
	System.out.println(doc); 
	return doc; 
	}
    public int checkBeds(int beds){ 
	System.out.println(beds); 
	return beds; 
	}
    public double paySalary(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean emergency(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String report(String report){ 
	System.out.println(report); 
	return report; 
	}
    public boolean maintain(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}