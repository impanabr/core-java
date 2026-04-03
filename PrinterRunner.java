class PrinterRunner{
	public static void main(String[]args){
		Printer ref=new Printer("Canon","Laser",9000,10,"black",true);
		Printer refl =new Printer();
		ref.brand="Canon";
		ref.type="Laser";
		ref.price=8000;
		ref.speed=20;
		ref.color="White";
		ref.wifi=true;
		ref.display();
	}
}


		
	