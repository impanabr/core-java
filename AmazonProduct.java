class AmazonProduct{
static String productNames[]={"Oppo A16K","Haier Washingmachine","Vivo200pro","LG refrigerator","Dell Loptop"};
static float productPrice[]={1999.00f,5679.00f,2999.50f,2300.99f,4500.00f};
static float productRating[]={4.5f,5.5f,4.0f,4.3f,4.8f};
public static void getAmazonProductDetails(){
		
		for(int index=0;index<productNames.length;index++){
			System.out.println("Product Name:"+productNames[index]);
			System.out.println("Product Price:"+productPrice[index]);
			System.out.println("Product Rating:"+productRating[index]);
			System.out.println();
	}
}
}

