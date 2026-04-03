class Instagram{
	public void login(String facebook){
	System.out.println("Invoking login using FaceBook:"+facebook);
	}
    public void login(String userName,String psw){
	System.out.println("Invoking login using user name "+userName+" and "+"psw:"+psw);
	}
	/*
	public void login(String email,String psw){
	System.out.println("Invoking login using email ID "+email+" and "+"psw:"+psw);
	}*/
	public void login(long pnum,String psw){
	System.out.println("Invoking login using phone Number "+pnum+" and "+"psw:"+psw);
	}
}

