class Book {

//status
    String title;
    String author;
    int pages;
    int edition;
    double price;
    double rating;
    boolean isAvailable;
    boolean isDigital;
    String genre;
    int year;

//behaviour
    public String read(String page){ 
	System.out.println(page); 
	return page; 
	}
    public int bookmark(int page){ 
	System.out.println(page); 
	return page; 
	}
    public double buy(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean borrow(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String review(String review){ 
	System.out.println(review); 
	return review; 
	}
    public int rate(int stars){ 
	System.out.println(stars); 
	return stars; 
	}
    public double discount(double amt){ 
	System.out.println(amt); 
	return amt; 
	}
    public boolean returnBook(boolean status){ 
	System.out.println(status); 
	return status; 
	}
    public String category(String type){ 
	System.out.println(type); 
	return type; 
	}
    public boolean sell(boolean status){ 
	System.out.println(status); 
	return status; 
	}
}