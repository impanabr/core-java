class Teacher {

//status
    String name;
    String subject;
    int age;
    int experience;
    double salary;
    double bonus;
    boolean isPermanent;
    boolean isAvailable;
    String qualification;
    int joiningYear;
	
//behaviours
    public String teach(String topic){ 
	System.out.println(topic); 
	return topic;
	}
    public int takeAttendance(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double assignMarks(double marks){
	System.out.println(marks); 
	return marks; 
	}
    public boolean conductExam(boolean status){
	System.out.println(status); 
	return status;
	}
    public String guideStudent(String name){ 
	System.out.println(name); 
	return name; 
	}
    public int evaluate(int papers){ 
	System.out.println(papers);
	return papers; 
	}
    public double getSalary(double amount){ 
	System.out.println(amount);
	return amount; 
	}
    public boolean attendMeeting(boolean status){ 
	System.out.println(status); 
	return status;
	}
    public String prepareNotes(String topic){ 
	System.out.println(topic); 
	return topic; 
	}
    public boolean completeSyllabus(boolean status){ 
	System.out.println(status);
	return status; 
	}
}