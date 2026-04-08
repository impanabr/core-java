class College {
//status
    String name;
    String location;
    int students;
    int departments;
    double fee;
    double fund;
    boolean hostel;
    boolean library;
    String principal;
    int year;
//behaviour
    public String lecture(String sub){ 
	System.out.println(sub); 
	return sub; 
	}
    public int admission(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double fee(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean exam(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String assign(String prof){ 
	System.out.println(prof); 
	return prof; 
	}
    public int result(int marks){ 
	System.out.println(marks); 
	return marks; 
	}
    public double salary(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean event(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String dept(String name){ 
	System.out.println(name); 
	return name; 
	}
    public boolean close(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}