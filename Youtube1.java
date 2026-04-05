class Youtube1{
  public String search(String movieName){
    System.out.println("invoking search movieName:"+movieName);
    String message = null;
	
	boolean islogin =login("Impana","Impu@2005");
	if(islogin){
		System.out.println("login successfully");
    if(movieName != null){
	  message= "searched movie Name is available:" + movieName;
    }
	
	}else{
		message = "invalid userName and psw";
	}
	
    return message;
  }
  public String search(String movieName,String heroName){
    System.out.println("invoking search movieName:"+movieName+"and heroName:"+heroName);
    String message=null;
	 if(message!=movieName && message!=heroName){
	  message="searched movie Name:"+movieName+"and hero Name:"+heroName+" is available";
    }
    return message;
  }
  public boolean login(String userName,String psw){
	  System.out.println("invoking login using userName:"+userName+" and psw:"+psw);
	  String reguserName="Impana";
	  String regpsw="Impu@123";
	  boolean islogin=false;
	  if(userName==reguserName && psw==regpsw){
		  islogin=true;
	  }else{
		  islogin=false;
	  }
	    return islogin;
    }
    public String login(String email,String psw,String captcha){
	  System.out.println("invoking login using email:"+email+" psw:"+psw+"captcha:"+captcha);
	  String regemail="Impana@gmail.com";
	  String regpsw="Impu@123";
	  String islogin=null;
	  if(email==regemail && psw==regpsw){
		  islogin="Login Successfully";
	  }else{
		  islogin="Login failled";
	  }
	   return islogin;
    }

}
