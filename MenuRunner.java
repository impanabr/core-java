class MenuRunner{

public static void main(String[] food){
	Menu amaravathi=new Menu();
	amaravathi.getMenuDetails();
	amaravathi.checkFoodByFoodName("chicken fride rice");
	amaravathi.checkFoodByFoodName("poori");
	amaravathi.checkFoodByFoodName("bath");
	amaravathi.checkFoodByFoodName("kaba");
	amaravathi.checkFoodByFoodName("biriyani");

    double price=amaravathi.checkFoodPriceByFoodName("chickrn kabab");
    System.out.println("the price is:"+price);
	price = amaravathi.checkFoodPriceByFoodName("poori");
    System.out.println("the price is:" + price);
    price=amaravathi.checkFoodPriceByFoodName("kabab");
    System.out.println("the price is:"+price);
	price=amaravathi.checkFoodPriceByFoodName("chapathi");
    System.out.println("the price is:"+price);
    price=amaravathi.checkFoodPriceByFoodName("Idli");
    System.out.println("the price is:"+price);
	}
}


	