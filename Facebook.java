class Facebook{
public static String validateAndRegister(long mobileNumber,String psw,String birthday,String fullName,String userName){
	System.out.println("validateAndRegister method is started");
	String registerStatus = null;
	if(mobileNumber != 0 && psw != null && birthday != null && fullName != null && userName != null){
		if(psw.length()>0 && fullName.length()>0 && userName.length()>0){
			registerStatus = "Thank you" +fullName + "Registered Successfuly";
		}else{
			registerStatus ="Please check the length of psw,FullName,UserName";
		}
	}else{
		registerStatus ="Please enter the valid data";
	} 
	System.out.println("validateAndRegister method is ended");
	return registerStatus;
}
}