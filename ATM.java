class ATM {
//status
    String bankName;
    String location;
    int cashAvailable;
    int users;
    double withdrawalLimit;
    double depositLimit;
    boolean isWorking;
    boolean hasCash;
    String manager;
    int year;
//behaviour
    public String insertCard(String card){ 
	System.out.println(card); 
	return card; 
	}
    public int enterPin(int pin){ 
	System.out.println(pin); 
	return pin; 
	}
    public double withdraw(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean checkBalance(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String deposit(String type){ 
	System.out.println(type); 
	return type; 
	}
    public int miniStatement(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double transfer(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean ejectCard(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String language(String lang){ 
	System.out.println(lang); 
	return lang; 
	}
    public boolean shutdown(boolean status){ 
    System.out.println(status); 
	return status; 
	}
}