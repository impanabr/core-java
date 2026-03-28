class ChatCenter{
public void getMenuDetails(){
System.out.println("Invoking getMenuDetails");
}
public void checkItemByName(String ItemName){
	System.out.println("Invoking checkItemByName");
if(ItemName=="Pani Puri"){
    System.out.println("Available");
}
else if(ItemName=="Bhel Puri"){
	System.out.println("Available");
}
else if(ItemName=="Sev Puri"){
	System.out.println("Available");
}
else if(ItemName=="Samosa Chat"){
	System.out.println("Available");
}
else if(ItemName=="Masala Puri"){
	System.out.println("Available");
}
else if(ItemName=="Dahi Puri"){
	System.out.println("Available");
}
else if(ItemName=="Aloo Tikka"){
	System.out.println("Available");
}
else if(ItemName=="Papad Chat"){
	System.out.println("Available");
}
else if(ItemName=="Vada Pav"){
	System.out.println("Available");
}
else if(ItemName=="Veg Sandwich"){
	System.out.println("Available");
}
else{
	System.out.println("Not Available");
}
}
}