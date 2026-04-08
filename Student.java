class Student {
    // Properties
    String name;
    String course;
    int age;
    int rollNo;
    double marks;
    double fees;
    boolean isPassed;
    boolean isActive;
    String grade;
    int year;
    // Behaviour
    public String study(String subject){ 
	System.out.println(subject); 
	return subject; 
	}
    public int attendClass(int days){ 
	System.out.println(days); 
	return days; 
	}
    public double writeExam(double marks){ 
	System.out.println(marks); 
	return marks; 
	}
    public boolean pass(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String submitAssignment(String topic){ 
	System.out.println(topic); 
	return topic; 
	}
    public int getAttendance(int percent){ 
	System.out.println(percent); 
	return percent; 
	}
    public double payFees(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean participate(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String getResult(String result){ 
	System.out.println(result); 
	return result; 
	}
    public boolean graduate(boolean status){ 
	System.out.println(status); 
	return status; 
	}	
}