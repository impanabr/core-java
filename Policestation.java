class PoliceStation {
//status
    String name;
    String location;
    int officers;
    int cases;
    double budget;
    double fines;
    boolean isActive;
    boolean hasJail;
    String inspector;
    int year;
//behaviour
    public String fileCase(String caseName){ 
	System.out.println(caseName); 
	return caseName; 
	}
    public int arrest(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double collectFine(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean investigate(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String assignOfficer(String name){ 
	System.out.println(name); 
	return name; 
	}
    public int report(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double spend(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean patrol(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String complaint(String data){ 
	System.out.println(data); 
	return data; 
	}
    public boolean closeCase(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}