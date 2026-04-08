class Car {
//status
    String brand;
    String model;
    int speed;
    int seats;
    double price;
    double mileage;
    boolean isRunning;
    boolean isElectric;
    String color;
    int year;
//behaviour
    public String start(String status){ 
	System.out.println(status); 
	return status; 
	}
    public int accelerate(int speed){ 
	System.out.println(speed); 
	return speed; 
	}
    public double fuel(double amount){ 
	System.out.println(amount); 
	return amount; 
	}
    public boolean stop(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String changeGear(String gear){ 
	System.out.println(gear); 
	return gear; 
	}
    public int brake(int level){ 
	System.out.println(level); 
	return level; 
	}
    public double service(double cost){ 
	System.out.println(cost); 
	return cost; 
	}
    public boolean park(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String playMusic(String song){ 
	System.out.println(song); 
	return song; 
	}
    public boolean lock(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}