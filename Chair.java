class Chair{
static String chairNames[]={"OfficeChair","PlasticChair","WoodenChair","DiningChair","FoldingChair","GamingChair","RockingChair","RevolvingChair"};
static float chairPrice[]={1500,500,2000,1800,2500,900,3500,2200,800};
static float chairRating[]={4.5f,5.5f,4.0f,4.3f,4.8f,4.1f,5.0f,4.3f};
public static void getChairDetails(){
		
		for(int index=0;index<chairNames.length;index++){
			System.out.println("Chair Name:"+chairNames[index]);
			System.out.println("Chair Price:"+chairPrice[index]);
			System.out.println("Chair Rating:"+chairRating[index]);
			System.out.println();
	}
}
}