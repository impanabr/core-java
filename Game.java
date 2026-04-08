class Game {
//status
    String name;
    String type;
    int players;
    int levels;
    double rating;
    double size;
    boolean isOnline;
    boolean isActive;
    String developer;
    int year;
//behaviour
    public String start(String status){ 
	System.out.println(status); 
	return status; 
	}
    public int play(int score){ 
	System.out.println(score); 
	return score; 
	}
    public double update(double size){ 
	System.out.println(size); 
	return size; 
	}
    public boolean pause(boolean status){ 
	System.out.println(status); r
	eturn status; 
	}
    public String level(String lvl){ 
	System.out.println(lvl); 
	return lvl; 
	}
    public int score(int score){ 
	System.out.println(score); 
	return score; 
	}
    public double purchase(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean multiplayer(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String save(String data){ 
	System.out.println(data); 
	return data; 
	}
    public boolean exit(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}