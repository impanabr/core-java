class Fan{
static String fanNames[]={"Usha","Orient","Havells","Crompton","Bajaj","v-Guard","Luminous","Khaitan"};
static float fanPrice[]={1200,1500,1800,1600,1400,1300,1700,1900};
static float fanRating[]={4.2f,5.1f,4.0f,4.3f,4.7f,5.5f,5.0f,4.0f};
public static void getFanDetails(){
		
		for(int index=0;index<fanNames.length;index++){
			System.out.println("Fan Name:"+fanNames[index]);
			System.out.println("Fan Price:"+fanPrice[index]);
			System.out.println("Fan Rating:"+fanRating[index]);
			System.out.println();
	}
}
}