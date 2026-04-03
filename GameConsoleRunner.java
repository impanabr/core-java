class GameConsoleRunner{
public static void main(String[]args){
	GameConsole ref=new GameConsole("Puma","PlayStation 5",600,59999,"AMD Ryzen Zen2",true);
		GameConsole refl=new GameConsole();
		ref.brand="Sony";
		ref.model="PlayStation 5";
		ref.storage=500;
		ref.price= 49999;
		ref.processor="AMD Ryzen Zen2";
		ref.wirelessController=true;
		ref.display();
	}
}