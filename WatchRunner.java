class WatchRunner{
public static void main(String[]args){
	Watch ref=new Watch("Titan","Analog","grey",5000,5,false);
		Watch refl=new Watch();
		ref.brand="Titan";
		ref.type="Analog";
		ref.color="Black";
		ref.price=3000;
		ref.bateryLife=4;
		ref.waterproof=true;
		ref.display();
	}
}