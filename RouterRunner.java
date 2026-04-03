class RouterRunner{
public static void main(String[]args){
	Router ref=new Router("TP-Link","Archer C6",1300,5,35000,false);
		Router refl=new Router();
		ref.brand="TP-Link";
		ref.model="Archer C6";
		ref.speed=1200;
		ref.antennas=4;
		ref.price=2599;
		ref.dualBrand=true;
		ref.display();
	}
}

