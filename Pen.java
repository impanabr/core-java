class Pen{
static String penNames[]={"Reynolds","Parker","Cello","Pilot","Faber-Castell","Uni","Lola","Sharpie"};
static float penPrice[]={10.00f,50.00f,20.00f,30.00f,40.00f,15.00f,25.00f,35.00f};
static String penTypes[]={"Ballpoint","Gel","Fountain","Rollerball","Finer","Thick","Thin","Marker"};
public static void getPenDetails(){
		
		for(int index=0;index<penNames.length;index++){
			System.out.println("PenNames:"+penNames[index]);
			System.out.println("PenPrice:"+penPrice[index]);
			System.out.println("PenTypes:"+penTypes[index]);
			System.out.println();
	}
}
}
