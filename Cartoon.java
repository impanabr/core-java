class Cartoon {
	
//status
    String name;
    String characterType;
    int episodes;
    int duration;
    double rating;
    double popularity;
    boolean isAnimated;
    boolean isFunny;
    String creator;
    int year;
	
//behaviour
    public String play(String episode){ 
	System.out.println(episode); 
	return episode; 
	}
    public int watch(int time){
	System.out.println(time); 
	return time; 
	}
    public double rate(double stars){ 
	System.out.println(stars); 
	return stars; 
	}
    public boolean pause(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String character(String name){ 
	System.out.println(name); 
	return name; 
	}
    public int season(int num){ System.out.println(num); 
	return num; 
	}
    public double download(double size){ 
	System.out.println(size); 
	return size; 
	}
    public boolean laugh(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String voice(String actor){ 
	System.out.println(actor); 
	return actor; 
	}
    public boolean stop(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}