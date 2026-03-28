class Products{
static String carsNames[]={"Alto","Baleno","City","Creta","Fortuner","Innova","i20","Swift","Scorpio","Eclipse","Thar"};
	static long carnumber[]={1023345, 4587578, 739771, 267648, 6779150, 7883476, 5878802, 6990914, 8788233, 124675, 657321, 987654, 123456, 789098, 678543};
	static char code[]={'a','b','c','d','e','f','g','h','i','y','j','n','u','k','r'};
	static float price[]={56000f,68000f,45000f,78000f,50000f,35000f,15000f,69000f,55000f,90000f,80000f,70000f,85000f,75000f,95000f};
	public static void main(String[]args){
		for(int index=0; index<carsNames.length;index++){
			
			if(index%2==0){
				System.out.println(carsNames[index]);
				System.out.println(carnumber[index]);
				System.out.println(code[index]);
				System.out.println(price[index]);
			}
		}
	}
}

				
				
				