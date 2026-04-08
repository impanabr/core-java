class Laptop {
//status
    String brand;
    String processor;
    int ram;
    int storage;
    double price;
    double weight;
    boolean isOn;
    boolean hasWifi;
    String os;
    int year;
//behaviour
    public String start(String status){ 
	System.out.println(status); 
	return status; 
	}
    public int runProgram(int count){ 
	System.out.println(count); 
	return count; 
	}
    public double installSoftware(double size){ 
	System.out.println(size); 
	return size; 
	}
    public boolean shutdown(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String browse(String site){ 
	System.out.println(site); 
	return site; 
	}
    public int battery(int percent){ 
	System.out.println(percent); 
	return percent; 
	}
    public double update(double size){ 
	System.out.println(size); 
	return size; 
	}
    public boolean connectWifi(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String playVideo(String video){ 
	System.out.println(video); 
	return video; 
	}
    public boolean sleep(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}