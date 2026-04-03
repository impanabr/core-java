class Veg{
public void getMenuDetails(){
System.out.println("Invoking getMenuDetails");
}
public void checkItemByName(String ItemName){
	System.out.println("Invoking checkItemByName");
if(ItemName=="Masala dosa"){
    System.out.println("Available");
}
else if(ItemName=="Palak paneer"){
	System.out.println("Available");
}
else if(ItemName=="Chole masala"){
	System.out.println("Available");
}
else if(ItemName=="Veg kadai"){
	System.out.println("Available");
}
else if(ItemName=="Veg bath"){
	System.out.println("Available");
}
else if(ItemName=="Pongal"){
	System.out.println("Available");
}
else if(ItemName=="Poori"){
	System.out.println("Available");
}
else if(ItemName=="Veg biryani"){
	System.out.println("Available");
}
else if(ItemName=="Parota"){
	System.out.println("Available");
}
else if(ItemName=="Curd rice"){
	System.out.println("Available");
}
else{
	System.out.println("Not Available");
}
}
}