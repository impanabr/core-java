class Electronic{
static String productNames[]={"Refrigerator","WashingMachine","AirConditioner","Laptop","Mobile","Television","Speaker","Printer"};
static String productColor[]={"Red","Black","Grey","Silver","White","Blue","Grey","Black"};
static float productRating[]={4.5f,5.5f,4.0f,4.3f,4.8f,4.1f,4.8f,4.2f};
public static void getElectronicDetails(){
		
		for(int index=0;index<productNames.length;index++){
			System.out.println("Product Name:"+productNames[index]);
			System.out.println("Product Color:"+productColor[index]);
			System.out.println("Product Rating:"+productRating[index]);
			System.out.println();
	}
}
}

