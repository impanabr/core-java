class NonVegRunner{
public static void main(String[]food){
	NonVeg nonveg1 = new NonVeg();
	nonveg1.checkItemByName("Butter chicken");
	nonveg1.checkItemByName("Veg SandWitch");
	nonveg1.checkItemByName("Seafood");
	nonveg1.checkItemByName("Poori");
	
	NonVeg nonveg2 = new NonVeg();
	nonveg2.checkItemByName("Chicken kabab");
	nonveg2.checkItemByName("Veg SandWitch");
	nonveg2.checkItemByName("Chicken biryani");
    nonveg2.checkItemByName("Veg Bath");
	
	NonVeg nonveg3 = new NonVeg();
	nonveg3.checkItemByName("Fish curry");
	nonveg3.checkItemByName("Vada Pav");
	nonveg3.checkItemByName("Tandoori chicken");
	nonveg3.checkItemByName("Dosa");
	
	NonVeg nonveg4 = new NonVeg();
	nonveg4.checkItemByName("Chicken lollipo");
	nonveg4.checkItemByName("Keema matar");
	nonveg4.checkItemByName("Pongal");
	nonveg4.checkItemByName("Parota");
	
    NonVeg nonveg5 = new NonVeg();
	nonveg5.checkItemByName("Chicken tikka masala");
	nonveg5.checkItemByName("Veg SandWitch");
	nonveg5.checkItemByName("Mutton biryani");
	nonveg5.checkItemByName("Dahi Puri");	
}
}