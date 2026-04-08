class Employee {
//status
    String name;
    String department;
    int id;
    int age;
    double salary;
    double bonus;
    boolean isWorking;
    boolean isOnLeave;
    String role;
    int joiningYear;
//behaviour
    public String work(String task){ 
	System.out.println(task); 
	return task; 
	}
    public int attendMeeting(int hours){ 
	System.out.println(hours); 
	return hours; 
	}
    public double getSalary(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean takeLeave(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String completeTask(String task){ 
	System.out.println(task); 
	return task; 
	}
    public int login(int time){ 
	System.out.println(time); 
	return time; 
	}
    public double bonus(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean logout(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String report(String data){ 
	System.out.println(data); 
	return data; 
	}
    public boolean resign(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}