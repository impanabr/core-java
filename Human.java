class Human {
	
    // Properties
    String name;
    int age;
    double height;
    double weight;
    String gender;
    String profession;
    boolean isHealthy;
    boolean isEmployed;
    String country;
    int experience;

    // Behaviour
    public String eat(String food){ 
	System.out.println(food); 
	return food; 
	}
    public int walk(int steps){ 
	System.out.println(steps); 
	return steps; 
	}
    public double sleep(double hours){ 
	System.out.println(hours); 
	return hours; 
	}
    public boolean work(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String speak(String words){ 
	System.out.println(words); 
	return words; 
	}
    public int exercise(int mins){ 
	System.out.println(mins); 
	return mins; 
	}
    public double earn(double salary){ 
	System.out.println(salary); 
	return salary; 
	}
    public boolean think(boolean idea){ 
	System.out.println(idea); 
	return idea; 
	}
    public String learn(String topic){ 
	System.out.println(topic); 
	return topic; 
	}
    public boolean rest(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}