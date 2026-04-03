class Server{
String serverName;
String operationSystem;
int ram;
int storage;
double uptime;
String location;

public Server(String serverName,String operationSystem,int ram,int storage,double uptime,String location){
	System.out.println("Server details with parameter:"+serverName+","+operationSystem+","+ram+","+storage+","+uptime+","+location);
}
public Server(){
	System.out.println("default constructor");
}
public void display(){
	System.out.println("Server ServerName:"+serverName);
	System.out.println("Server OperationSystem:"+operationSystem);
	System.out.println("Server Ram:"+ram);
	System.out.println("Server Storage:"+storage);
	System.out.println("Server Uptime:"+uptime);
	System.out.println("Server Location:"+location);
}
}
