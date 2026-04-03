class VegRunner{
public static void main(String[]food){
	Veg veg1 = new Veg();
	veg1.checkItemByName("Pani Puri");
	veg1.checkItemByName("Parota");
	veg1.checkItemByName("Bhel Puri");
	veg1.checkItemByName("Poori");
	
	Veg veg2 = new Veg();
	veg2.checkItemByName("Veg biryani");
	veg2.checkItemByName("Veg SandWitch");
	veg2.checkItemByName("Bhel Puri");
	veg2.checkItemByName("Veg Bath");
	
	Veg veg3 = new Veg();
	veg3.checkItemByName("Panner masala");
	veg3.checkItemByName("Veg bath");
    veg3.checkItemByName("Puzzia");
	veg3.checkItemByName("Masala dosa");
	
	Veg veg4 = new Veg();
	veg4.checkItemByName("Pani Puri");
	veg4.checkItemByName("Veg Roll");
	veg4.checkItemByName("Pongal");
	veg4.checkItemByName("Curd rice");
	
	Veg veg5 = new Veg();
	veg5.checkItemByName("Chicken Kabab");
	veg5.checkItemByName("Veg SandWitch");
	veg5.checkItemByName("Veg bath");
	veg5.checkItemByName("Dahi Puri");	
}
}