class Bank {
//status
    String name;
    String branch;
    int employees;
    int customers;
    double balance;
    double interestRate;
    boolean isOpen;
    boolean hasLoan;
    String manager;
    int year;
//behaviour
    public String openAccount(String name){ 
	System.out.println(name); 
	return name; 
	}
    public int deposit(int amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public double withdraw(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean checkBalance(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String applyLoan(String type){ 
	System.out.println(type); 
	return type; 
	}
    public int transfer(int amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public double calculateInterest(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean closeAccount(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String generateStatement(String data){ 
	System.out.println(data); 
	return data; 
	}
    public boolean verifyUser(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}