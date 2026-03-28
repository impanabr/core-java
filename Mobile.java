class Mobile{
static String mobileNames[]={"Apple","Realme","Samsung","Vivo","OnePlus","Nokia","Redmi","Poco","Honor","Oppo","Sony","GooglePixel","Huawei","Asus}","Motorola"};
	static long mobilenumber[]={1012345, 4587578, 739771, 267648, 6779150, 7883476, 5878802, 6990914, 8788233, 124675, 657321, 987654, 123456, 789098, 678543};
	static char code[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'};
	static float price[]={56000f,68000f,45000f,78000f,50000f,35000f,15000f,69000f,55000f,90000f,80000f,70000f,85000f,75000f,95000f};
	public static void main(String[]args){
		for(int index=0; index<mobileNames.length;index++){
			
			if(index%2!=0){
				System.out.println(mobileNames[index]);
				System.out.println(mobilenumber[index]);
				System.out.println(code[index]);
				System.out.println(price[index]);
			}
		}
	}
	}
	