class Park {
//status
    String name;
    String location;
    int trees;
    int visitors;
    double area;
    double maintenanceCost;
    boolean isOpen;
    boolean hasPlayArea;
    String caretaker;
    int year;
//behaviour
    public String open(String status){ 
	System.out.println(status); 
	return status; 
	}
    public int entry(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double ticket(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean clean(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String plant(String tree){ 
	System.out.println(tree); 
	return tree; 
	}
    public int visitors(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double maintain(double cost){ 
	System.out.println(cost); 
	return cost; 
	}
    public boolean security(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String event(String name){ 
	System.out.println(name); 
	return name; 
	}
    public boolean close(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}