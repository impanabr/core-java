class ServerRunner{
public static void main(String[]args){
	Server ref=new Server("AppServer01","Linux",5,250,88.9,"AP");
		Server refl=new Server();
		ref.serverName="AppServer01";
		ref.operationSystem="Linux";
		ref.ram=8;
		ref.storage=256;
		ref.uptime=99.5;
		ref.location="India";
		ref.display();
	}
}