class RestaurantRunner{
	public static void main(String[]args){
		Restaurant ref=new Restaurant("vaibhav Palace","Mandya","SouthIndian",4.2f,100,true);
		Restaurant refl=new Restaurant();
		ref.name="Udupi Palace";
		ref.location="Bangalore";
		ref.cuisine="South Indian";
		ref.rating=4.3f;
		ref.seatingCapacity=120;
		ref.homeDelivery=true;
		ref.display();
	}
}


		
	