class Camera {

//status
    String brand;
    String model;
    int megapixel;
    int zoom;
    double price;
    double weight;
    boolean isOn;
    boolean hasFlash;
    String color;
    int year;

//behaviour
    public String capture(String photo){ 
	System.out.println(photo); 
	return photo; 
	}
    public int zoom(int level){ 
	System.out.println(level); 
	return level; }
    public double record(double time){ 
	System.out.println(time); 
	return time; 
	}
    public boolean flash(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String focus(String mode){ 
	System.out.println(mode); 
	return mode; 
	}
    public int battery(int percent){ 
	System.out.println(percent); 
	return percent; 
	}
    public double storage(double size){ 
	System.out.println(size); 
	return size; 
	}
    public boolean power(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String filter(String name){ 
	System.out.println(name); 
	return name; 
	}
    public boolean off(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}