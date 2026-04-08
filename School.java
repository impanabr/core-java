class School {
//status
    String name;
    String location;
    int students;
    int teachers;
    double fee;
    double budget;
    boolean hasLibrary;
    boolean hasPlayground;
    String principal;
    int year;
//behaviour
    public String conductClass(String cls){ 
	System.out.println(cls); 
	return cls; 
	}
    public int admit(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double collectFee(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean exam(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String assignTeacher(String name){ 
	System.out.println(name); 
	return name; 
	}
    public int attendance(int percent){ 
	System.out.println(percent); 
	return percent; 
	}
    public double expenses(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean holiday(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String event(String name){ 
	System.out.println(name); 
	return name; 
	}
    public boolean discipline(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}