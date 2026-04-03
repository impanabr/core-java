class Menu{
	public void getMenuDetails(){
		System.out.println("Invoking getMenuDetails");
		}
		public void checkFoodByFoodName(String foodName){
			System.out.println("invoking checkFoodByFoodName");

			if(foodName=="Idli"){
				System.out.println("Available");
			}
            else if (foodName=="biriyani"){
				System.out.println("Available");
			}
	        else if (foodName=="poori"){
				System.out.println("Available");
			}
             else if (foodName=="kabab"){System.out.println("Available");
			}
            else if (foodName=="chapathi"){
				System.out.println("Available");
			}else{
				System.out.println(" not Available");
	}
		}
public double checkFoodPriceByFoodName(String foodName){
	System.out.println("invoking checkFoodPriceByFoodName and the food Name:"+foodName);
double foodPrice=0.0;
           if(foodName=="Idli"){
			   foodPrice=40;
			}
            else if (foodName=="biriyani"){
				foodPrice=100;
			}
	        else if (foodName=="poori"){
				foodPrice=60;
			}
             else if (foodName=="kabab"){
				foodPrice=110;
			}
            else if (foodName=="chapathi"){
				foodPrice=50;
			}else{
				System.out.println(foodName+"is not available");
			}
			return foodPrice;
}
		}




