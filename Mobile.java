class Mobile {
//status
    String brand;
    String model;
    int battery;
    int storage;
    double price;
    double weight;
    boolean isOn;
    boolean hasCamera;
    String color;
    int year;
//behaviour
    public String call(String number){ 
	System.out.println(number); 
	return number; 
	}
    public int charge(int percent){ 
	System.out.println(percent); 
	return percent; 
	}
    public double installApp(double size){ 
	System.out.println(size); 
	return size; 
	}
    public boolean switchOn(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String message(String msg){ 
	System.out.println(msg); 
	return msg; 
	}
    public int volume(int level){ 
	System.out.println(level); 
	return level; 
	}
    public double useData(double data){ 
	System.out.println(data); 
	return data; 
	}
    public boolean wifi(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String camera(String mode){ 
	System.out.println(mode); 
	return mode; 
	}
    public boolean powerOff(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}