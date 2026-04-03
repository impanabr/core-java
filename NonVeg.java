class NonVeg{
public void getMenuDetails(){
System.out.println("Invoking getMenuDetails");
}
public void checkItemByName(String ItemName){
	System.out.println("Invoking checkItemByName");
if(ItemName=="Chicken kabab"){
    System.out.println("Available");
}
else if(ItemName=="Fish curry"){
	System.out.println("Available");
}
else if(ItemName=="Chicken curry"){
	System.out.println("Available");
}
else if(ItemName=="Chicken tikka masala"){
	System.out.println("Available");
}
else if(ItemName=="Mutton biryani"){
	System.out.println("Available");
}
else if(ItemName=="Seafood"){
	System.out.println("Available");
}
else if(ItemName=="Chicken biryani"){
	System.out.println("Available");
}
else if(ItemName=="Keema matar"){
	System.out.println("Available");
}
else if(ItemName=="Chicken lollipop"){
	System.out.println("Available");
}
else if(ItemName=="Butter chicken"){
	System.out.println("Available");
}
else{
	System.out.println("Not Available");
}
}
}